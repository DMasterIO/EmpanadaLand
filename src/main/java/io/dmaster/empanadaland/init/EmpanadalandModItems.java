
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.dmaster.empanadaland.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Item;
import net.minecraft.core.registries.Registries;

import io.dmaster.empanadaland.item.VasoTerremotoItem;
import io.dmaster.empanadaland.item.VasoChupilcaItem;
import io.dmaster.empanadaland.item.QuesoItem;
import io.dmaster.empanadaland.item.MasaMadreItem;
import io.dmaster.empanadaland.item.HarinaItem;
import io.dmaster.empanadaland.item.EmpanadaQuesoItem;
import io.dmaster.empanadaland.item.EmpanadaPinoItem;
import io.dmaster.empanadaland.item.EmpanadaPastelChocloItem;
import io.dmaster.empanadaland.EmpanadalandMod;

public class EmpanadalandModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(Registries.ITEM, EmpanadalandMod.MODID);
	public static final DeferredHolder<Item, Item> EMPANADA_PINO = REGISTRY.register("empanada_pino", () -> new EmpanadaPinoItem());
	public static final DeferredHolder<Item, Item> EMPANADA_QUESO = REGISTRY.register("empanada_queso", () -> new EmpanadaQuesoItem());
	public static final DeferredHolder<Item, Item> EMPANADA_PASTEL_CHOCLO = REGISTRY.register("empanada_pastel_choclo", () -> new EmpanadaPastelChocloItem());
	public static final DeferredHolder<Item, Item> VASO_CHUPILCA = REGISTRY.register("vaso_chupilca", () -> new VasoChupilcaItem());
	public static final DeferredHolder<Item, Item> QUESO = REGISTRY.register("queso", () -> new QuesoItem());
	public static final DeferredHolder<Item, Item> MASA_MADRE = REGISTRY.register("masa_madre", () -> new MasaMadreItem());
	public static final DeferredHolder<Item, Item> HARINA = REGISTRY.register("harina", () -> new HarinaItem());
	public static final DeferredHolder<Item, Item> VASO_TERREMOTO = REGISTRY.register("vaso_terremoto", () -> new VasoTerremotoItem());
}
