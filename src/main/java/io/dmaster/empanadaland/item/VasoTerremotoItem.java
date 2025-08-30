
package io.dmaster.empanadaland.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import java.util.function.Consumer;

import io.dmaster.empanadaland.procedures.VasoTerremotoPlayerFinishesUsingItemProcedure;

public class VasoTerremotoItem extends Item {
	public VasoTerremotoItem() {
		super(new Item.Properties()
			.stacksTo(64)
			.rarity(Rarity.UNCOMMON)
			.food(new FoodProperties.Builder()
				.nutrition(1)
				.saturationModifier(0.2f)
				.alwaysEdible()
				.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> components, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, display, components, flag);
		components.accept(Component.literal("Trago tipico chileno"));
		components.accept(Component.literal("Te da una fuerza increíble"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(Items.GLASS_BOTTLE);
		super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		VasoTerremotoPlayerFinishesUsingItemProcedure.execute(entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
