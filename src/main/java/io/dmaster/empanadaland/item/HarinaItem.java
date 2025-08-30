
package io.dmaster.empanadaland.item;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.function.Consumer;

public class HarinaItem extends Item {
	public HarinaItem() {
		super(new Item.Properties()
			.stacksTo(64)
			.rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> components, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, display, components, flag);
		components.accept(Component.literal("Harina sin polvos de hornear"));
	}
}
