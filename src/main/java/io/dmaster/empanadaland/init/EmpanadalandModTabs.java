
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.dmaster.empanadaland.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class EmpanadalandModTabs {
	public static CreativeModeTab TAB_EMPANADA_LAND;

	public static void load() {
		TAB_EMPANADA_LAND = new CreativeModeTab("tabempanada_land") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(EmpanadalandModItems.EMPANADA_QUESO.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
