package net.orcinus.cavesandtrenches.client.renderer.layer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HorseModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.orcinus.cavesandtrenches.api.IBanner;
import net.orcinus.cavesandtrenches.init.CTItems;
import net.orcinus.cavesandtrenches.items.CTHorseArmorItem;

@OnlyIn(Dist.CLIENT)
public class HorseBannerLayer extends RenderLayer<Horse, HorseModel<Horse>> {

    public HorseBannerLayer(RenderLayerParent<Horse, HorseModel<Horse>> parent) {
        super(parent);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource source, int packedLight, Horse entity, float p_117353_, float p_117354_, float p_117355_, float p_117356_, float p_117357_, float p_117358_) {
        if (entity.getArmor().is(CTItems.STERLING_HORSE_ARMOR.get())) {
            if (!((IBanner) entity).getBanner().isEmpty()) {
                ItemStack itemstack = ((IBanner) entity).getBanner();
                if (itemstack != null) {
                    if (!itemstack.isEmpty()) {
                        Item item = itemstack.getItem();
                        poseStack.pushPose();
                        poseStack.scale(1.0F, 1.0F, 1.0F);
                        this.getParentModel().headParts().forEach(modelPart -> modelPart.translateAndRotate(poseStack));
                        if (!(item instanceof ArmorItem) || ((ArmorItem) item).getSlot() != EquipmentSlot.HEAD) {
                            poseStack.translate(0.0D, -0.5D, 0.0D);
                            poseStack.mulPose(Vector3f.XP.rotationDegrees(-30.0F));
                            poseStack.mulPose(Vector3f.YP.rotationDegrees(180.0F));
                            poseStack.scale(0.625F, -0.625F, -0.625F);
                            Minecraft.getInstance().getItemInHandRenderer().renderItem(entity, itemstack, ItemTransforms.TransformType.HEAD, false, poseStack, source, packedLight);
                        }
                        poseStack.popPose();
                    }
                }
            }
        }
    }
}
