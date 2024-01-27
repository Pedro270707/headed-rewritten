package net.pedroricardo.content.loottable;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.*;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.AnyOfLootCondition;
import net.minecraft.loot.condition.EntityPropertiesLootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.entry.AlternativeEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.CopyNameLootFunction;
import net.minecraft.loot.function.FillPlayerHeadLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.StringNbtReader;
import net.minecraft.predicate.NbtPredicate;
import net.minecraft.predicate.entity.EntityPredicate;
import net.pedroricardo.HeadedRewritten;
import net.pedroricardo.content.HeadURLs;
import net.pedroricardo.content.HeadedServerHead;

public class HeadedLootTable {
    // This class adds the heads to the loot table
    // Every pool uses the KilledByChargedCreeperLootCondition
    // loot table condition. Check it out!

    public static void init() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.VILLAGER.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().conditionally(KilledByChargedCreeperLootCondition.builder())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.ARMORER_VILLAGER)
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:armorer\"}}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.BUTCHER_VILLAGER)
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:butcher\"}}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.CARTOGRAPHER_VILLAGER)
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:cartographer\"}}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.CLERIC_VILLAGER)
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:cleric\"}}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.FARMER_VILLAGER)
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:farmer\"}}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.FISHERMAN_VILLAGER)
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:fisherman\"}}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.FLETCHER_VILLAGER)
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:fletcher\"}}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.VILLAGER)
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:leatherworker\"}}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.LIBRARIAN_VILLAGER)
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:librarian\"}}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.VILLAGER)
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:mason\"}}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.VILLAGER)
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:nitwit\"}}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.VILLAGER)
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:none\"}}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.VILLAGER)
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:shepherd\"}}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.VILLAGER)
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:toolsmith\"}}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.VILLAGER)
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:weaponsmith\"}}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder())).build())
                        .build();
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.EVOKER.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().conditionally(KilledByChargedCreeperLootCondition.builder())
                        .with(HeadedServerHead.entry(HeadURLs.EVOKER)).build()).build();
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.VINDICATOR.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().conditionally(KilledByChargedCreeperLootCondition.builder())
                        .with(HeadedServerHead.entry(HeadURLs.VINDICATOR)).build()).build();
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.PILLAGER.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().conditionally(KilledByChargedCreeperLootCondition.builder())
                        .with(HeadedServerHead.entry(HeadURLs.PILLAGER)).build()).build();
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.ZOMBIE_HORSE.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().conditionally(KilledByChargedCreeperLootCondition.builder())
                        .with(HeadedServerHead.entry(HeadURLs.ZOMBIE_HORSE)).build()).build();
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.ZOMBIE_VILLAGER.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder()
                                .with(HeadedServerHead.entryBuilder(HeadURLs.ARMORER_ZOMBIE_VILLAGER)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:armorer\"}}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                                .with(HeadedServerHead.entryBuilder(HeadURLs.BUTCHER_ZOMBIE_VILLAGER)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:butcher\"}}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                                .with(HeadedServerHead.entryBuilder(HeadURLs.CARTOGRAPHER_ZOMBIE_VILLAGER)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:cartographer\"}}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                                .with(HeadedServerHead.entryBuilder(HeadURLs.CLERIC_ZOMBIE_VILLAGER)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:cleric\"}}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                                .with(HeadedServerHead.entryBuilder(HeadURLs.FARMER_ZOMBIE_VILLAGER)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:farmer\"}}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                                .with(HeadedServerHead.entryBuilder(HeadURLs.FISHERMAN_ZOMBIE_VILLAGER)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:fisherman\"}}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                                .with(HeadedServerHead.entryBuilder(HeadURLs.FLETCHER_ZOMBIE_VILLAGER)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:fletcher\"}}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                                .with(HeadedServerHead.entryBuilder(HeadURLs.ZOMBIE_VILLAGER)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:leatherworker\"}}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                                .with(HeadedServerHead.entryBuilder(HeadURLs.LIBRARIAN_ZOMBIE_VILLAGER)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:librarian\"}}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                                .with(HeadedServerHead.entryBuilder(HeadURLs.ZOMBIE_VILLAGER)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:mason\"}}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                                .with(HeadedServerHead.entryBuilder(HeadURLs.ZOMBIE_VILLAGER)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:nitwit\"}}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                                .with(HeadedServerHead.entryBuilder(HeadURLs.ZOMBIE_VILLAGER)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:none\"}}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                                .with(HeadedServerHead.entryBuilder(HeadURLs.ZOMBIE_VILLAGER)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:shepherd\"}}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                                .with(HeadedServerHead.entryBuilder(HeadURLs.ZOMBIE_VILLAGER)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:toolsmith\"}}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                                .with(HeadedServerHead.entryBuilder(HeadURLs.ZOMBIE_VILLAGER)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{VillagerData:{profession:\"minecraft:weaponsmith\"}}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).build())
                        .build()).build();
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.WANDERING_TRADER.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().conditionally(KilledByChargedCreeperLootCondition.builder())
                        .with(HeadedServerHead.entry(HeadURLs.WANDERING_TRADER)).build()).build();
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.ILLUSIONER.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().conditionally(KilledByChargedCreeperLootCondition.builder())
                        .with(HeadedServerHead.entry(HeadURLs.ILLUSIONER)).build()).build();
            }
        });
        NbtPredicate jebPredicate = predicate("{CustomName:\"\\\"jeb_\\\"\"}");
        NbtPredicate jebTextPredicate = predicate("{CustomName:\"{\\\"text\\\":\\\"jeb_\\\"}\"}");
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.SHEEP.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().conditionally(
                        AnyOfLootCondition.builder(
                                EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(jebPredicate)),
                                EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(jebTextPredicate))
                        ))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())
                        .with(HeadedServerHead.entryBuilder(HeadURLs.JEB_SHEEP).build()).build()).build();
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.WHITE_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.WHITE_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.ORANGE_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.ORANGE_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.MAGENTA_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.MAGENTA_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.LIGHT_BLUE_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.LIGHT_BLUE_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.YELLOW_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.YELLOW_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.LIME_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.LIME_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.PINK_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.PINK_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.GRAY_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.GRAY_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.LIGHT_GRAY_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.LIGHT_GRAY_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.CYAN_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.CYAN_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.PURPLE_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.PURPLE_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.BLUE_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.BLUE_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.BROWN_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.BROWN_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.GREEN_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.GREEN_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.RED_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.RED_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.BLACK_SHEEP_ENTITY.equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.BLACK_SHEEP)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.ALLAY.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.ALLAY))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.VEX.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.VEX))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.PIGLIN_BRUTE.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.PIGLIN_BRUTE))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.ZOMBIFIED_PIGLIN.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.ZOMBIFIED_PIGLIN))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.AXOLOTL.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.LUCY_AXOLOTL))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:" + AxolotlEntity.Variant.LUCY.getId() + "}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.WILD_AXOLOTL))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:" + AxolotlEntity.Variant.WILD.getId() + "}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.GOLD_AXOLOTL))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:" + AxolotlEntity.Variant.GOLD.getId() + "}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.CYAN_AXOLOTL))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:" + AxolotlEntity.Variant.CYAN.getId() + "}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.BLUE_AXOLOTL))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:" + AxolotlEntity.Variant.BLUE.getId() + "}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.COW.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.COW))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.DOLPHIN.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.DOLPHIN))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.DONKEY.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.DONKEY))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.BEE.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.BEE))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{AngerTime:0}"))))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{HasNectar:1b}"))).invert())
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.POLLINATED_BEE))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{AngerTime:0}"))))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{HasNectar:1b}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.ANGRY_BEE))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{AngerTime:0}"))).invert())
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{HasNectar:1b}"))).invert())
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.ANGRY_POLLINATED_BEE))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{AngerTime:0}"))).invert())
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{HasNectar:1b}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.MOOSHROOM.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.RED_MOOSHROOM))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Type:" + MooshroomEntity.Type.RED.asString() + "}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.BROWN_MOOSHROOM))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Type:" + MooshroomEntity.Type.BROWN.asString() + "}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.MULE.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.MULE))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.POLAR_BEAR.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.POLAR_BEAR))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.PUFFERFISH.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.PUFFERFISH))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.OCELOT.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.OCELOT))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.CAT.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entryBuilder(HeadURLs.ALL_BLACK_CAT)
                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{variant:\"minecraft:all_black\"}"))))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())
                        .alternatively(HeadedServerHead.entryBuilder(HeadURLs.BLACK_CAT)
                                .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{variant:\"minecraft:black\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder())
                                )
                        .alternatively(HeadedServerHead.entryBuilder(HeadURLs.BRITISH_SHORTHAIR_CAT)
                                .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{variant:\"minecraft:british_shorthair\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder())
                                )
                        .alternatively(HeadedServerHead.entryBuilder(HeadURLs.CALICO_CAT)
                                .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{variant:\"minecraft:calico\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder())
                                )
                        .alternatively(HeadedServerHead.entryBuilder(HeadURLs.JELLIE_CAT)
                                .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{variant:\"minecraft:jellie\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder())
                                )
                        .alternatively(HeadedServerHead.entryBuilder(HeadURLs.PERSIAN_CAT)
                                .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{variant:\"minecraft:persian\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder())
                                )
                        .alternatively(HeadedServerHead.entryBuilder(HeadURLs.RAGDOLL_CAT)
                                .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{variant:\"minecraft:ragdoll\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder())
                                )
                        .alternatively(HeadedServerHead.entryBuilder(HeadURLs.RED_CAT)
                                .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{variant:\"minecraft:red\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder())
                                )
                        .alternatively(HeadedServerHead.entryBuilder(HeadURLs.SIAMESE_CAT)
                                .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{variant:\"minecraft:siamese\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder())
                                )
                        .alternatively(HeadedServerHead.entryBuilder(HeadURLs.TABBY_CAT)
                                .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{variant:\"minecraft:tabby\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder())
                                )
                        .alternatively(HeadedServerHead.entryBuilder(HeadURLs.WHITE_CAT)
                                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{variant:\"minecraft:white\"}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder())
                        )));
            }
        });
        // Endermen teleport away when blown up.
        // Set up just in case.
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.ENDERMAN.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.ENDERMAN))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.ENDERMITE.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.ENDERMITE))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.FOX.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.FOX))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Type:" + FoxEntity.Type.RED.asString() + "}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.SNOW_FOX))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Type:" + FoxEntity.Type.SNOW.asString() + "}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.FROG.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.COLD_FROG))
                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{variant:\"minecraft:cold\"}"))))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())
                        .with(HeadedServerHead.entry(HeadURLs.TEMPERATE_FROG))
                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{variant:\"minecraft:temperate\"}"))))
                        .conditionally(KilledByChargedCreeperLootCondition.builder())
                        .with(HeadedServerHead.entry(HeadURLs.WARM_FROG))
                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{variant:\"minecraft:warm\"}"))))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.GHAST.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.GHAST))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.GLOW_SQUID.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.GLOW_SQUID))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.GOAT.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.GOAT))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.GUARDIAN.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.GUARDIAN))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.IRON_GOLEM.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.IRON_GOLEM))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.LLAMA.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.CREAMY_LLAMA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:0}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.WHITE_LLAMA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:1}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.BROWN_LLAMA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:2}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.GRAY_LLAMA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:3}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.MAGMA_CUBE.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.MAGMA_CUBE))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.PANDA.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.PANDA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{MainGene:\"normal\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.AGGRESSIVE_PANDA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{MainGene:\"aggressive\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.LAZY_PANDA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{MainGene:\"lazy\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.WORRIED_PANDA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{MainGene:\"worried\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.PLAYFUL_PANDA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{MainGene:\"playful\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.WEAK_PANDA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{MainGene:\"weak\",HiddenGene:\"weak\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.PANDA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{MainGene:\"weak\"}"))))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{MainGene:\"weak\",HiddenGene:\"weak\"}"))).invert())
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.PANDA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{HiddenGene:\"weak\"}"))))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{MainGene:\"weak\",HiddenGene:\"weak\"}"))).invert())
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.BROWN_PANDA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{MainGene:\"brown\",HiddenGene:\"brown\"}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.PANDA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{MainGene:\"brown\"}"))))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{MainGene:\"brown\",HiddenGene:\"brown\"}"))).invert())
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.PANDA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{HiddenGene:\"brown\"}"))))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{MainGene:\"brown\",HiddenGene:\"brown\"}"))).invert())
                                .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.DROWNED.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.DROWNED))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.ELDER_GUARDIAN.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.ELDER_GUARDIAN))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.PARROT.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.RED_PARROT))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:" + ParrotEntity.Variant.RED_BLUE.getId() + "}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.BLUE_PARROT))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:" + ParrotEntity.Variant.BLUE.getId() + "}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.GREEN_PARROT))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:" + ParrotEntity.Variant.GREEN.getId() + "}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.CYAN_PARROT))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:" + ParrotEntity.Variant.YELLOW_BLUE.getId() + "}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.GRAY_PARROT))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:" + ParrotEntity.Variant.GRAY.getId() + "}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.SHULKER.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.SHULKER))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.SILVERFISH.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.SILVERFISH))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.SKELETON_HORSE.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.SKELETON_HORSE))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.SLIME.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.SLIME))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.SNIFFER.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.SNIFFER))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.STRAY.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.STRAY))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.STRIDER.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.STRIDER))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.TADPOLE.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.TADPOLE))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.HOGLIN.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.HOGLIN))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.HORSE.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.WHITE_HORSE))
                                .conditionally(AnyOfLootCondition.builder(
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:0}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:256}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:512}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:768}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:1024}")))
                                ))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.CREAMY_HORSE))
                                .conditionally(AnyOfLootCondition.builder(
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:1}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:257}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:513}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:769}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:1025}")))
                                ))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.CHESTNUT_HORSE))
                                .conditionally(AnyOfLootCondition.builder(
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:2}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:258}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:514}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:770}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:1026}")))
                                ))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.BROWN_HORSE))
                                .conditionally(AnyOfLootCondition.builder(
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:3}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:259}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:515}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:771}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:1027}")))
                                ))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.BLACK_HORSE))
                                .conditionally(AnyOfLootCondition.builder(
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:4}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:261}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:516}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:772}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:1028}")))
                                ))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.GRAY_HORSE))
                                .conditionally(AnyOfLootCondition.builder(
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:5}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:262}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:517}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:773}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:1029}")))
                                ))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(HeadedServerHead.entry(HeadURLs.DARK_BROWN_HORSE))
                                .conditionally(AnyOfLootCondition.builder(
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:6}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:263}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:518}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:774}"))),
                                        EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:1030}")))
                                ))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.HUSK.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.HUSK))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.PIG.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.PIG))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.SPIDER.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.SPIDER))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.SQUID.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.SQUID))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.CAVE_SPIDER.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.CAVE_SPIDER))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.BLAZE.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.BLAZE))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.CAMEL.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.CAMEL))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        NbtPredicate toastPredicate = predicate("{CustomName:\"\\\"Toast\\\"\"}");
        NbtPredicate toastTextPredicate = predicate("{CustomName:\"{\\\"text\\\":\\\"Toast\\\"}\"}");
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.RABBIT.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0f))
                        .with(AlternativeEntry.builder(
                                HeadedServerHead.entryBuilder(HeadURLs.TOAST_RABBIT)
                                        .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                                        .conditionally(AnyOfLootCondition.builder(
                                                EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(toastPredicate)),
                                                EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(toastTextPredicate))
                                        ))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).alternatively(
                                HeadedServerHead.entryBuilder(HeadURLs.BROWN_RABBIT)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{RabbitType:" + RabbitEntity.RabbitType.BROWN.getId() + "}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder())).alternatively(
                                HeadedServerHead.entryBuilder(HeadURLs.WHITE_RABBIT)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{RabbitType:" + RabbitEntity.RabbitType.WHITE.getId() + "}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder())).alternatively(
                                HeadedServerHead.entryBuilder(HeadURLs.BLACK_RABBIT)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{RabbitType:" + RabbitEntity.RabbitType.BLACK.getId() + "}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder())).alternatively(
                                HeadedServerHead.entryBuilder(HeadURLs.BLACK_WHITE_RABBIT)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{RabbitType:" + RabbitEntity.RabbitType.WHITE_SPLOTCHED.getId() + "}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder())).alternatively(
                                HeadedServerHead.entryBuilder(HeadURLs.GOLD_RABBIT)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{RabbitType:" + RabbitEntity.RabbitType.GOLD.getId() + "}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder())).alternatively(
                                HeadedServerHead.entryBuilder(HeadURLs.SALT_PEPPER_RABBIT)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{RabbitType:" + RabbitEntity.RabbitType.SALT.getId() + "}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()).alternatively(
                                HeadedServerHead.entryBuilder(HeadURLs.KILLER_BUNNY)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{RabbitType:" + RabbitEntity.RabbitType.EVIL.getId() + "}"))))
                                        .conditionally(KilledByChargedCreeperLootCondition.builder()))
                                )).build()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.RAVAGER.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.RAVAGER))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.SALMON.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.SALMON))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.TRADER_LLAMA.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.CREAMY_TRADER_LLAMA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:0}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.WHITE_TRADER_LLAMA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:1}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.BROWN_TRADER_LLAMA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:2}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.GRAY_TRADER_LLAMA))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Variant:3}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.TROPICAL_FISH.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.TROPICAL_FISH))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.TURTLE.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.TURTLE))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.WITHER.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.WITHER))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.WOLF.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.WOLF))
                                .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{AngerTime:0}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.ANGRY_WOLF))
                                .apply(CopyNameLootFunction.builder(CopyNameLootFunction.Source.THIS))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{AngerTime:0}"))).invert())
                                .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.ZOGLIN.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.ZOGLIN))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.BAT.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.BAT))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.WARDEN.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.WARDEN))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.WITCH.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.WITCH))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.CHICKEN.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.CHICKEN))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.PHANTOM.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.PHANTOM))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.SNOW_GOLEM.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(HeadedServerHead.entry(HeadURLs.SNOW_GOLEM))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Pumpkin:1b}"))).invert())
                                .conditionally(KilledByChargedCreeperLootCondition.builder()))
                        .pool(LootPool.builder().with(ItemEntry.builder(Items.CARVED_PUMPKIN))
                                .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate("{Pumpkin:1b}"))))
                                .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && EntityType.PLAYER.getLootTableId().equals(id)) {
                tableBuilder.pool(LootPool.builder().with(ItemEntry.builder(Items.PLAYER_HEAD))
                        .apply(FillPlayerHeadLootFunction.builder(LootContext.EntityTarget.THIS))
                        .conditionally(KilledByChargedCreeperLootCondition.builder()));
            }
        });
        HeadedRewritten.LOGGER.debug("Initializing loot table modifications");
    }

    private static NbtPredicate predicate(String nbt) {
        try {
            return new NbtPredicate(new StringNbtReader(new StringReader(nbt)).parseCompound());
        } catch (CommandSyntaxException e) {
            return new NbtPredicate(new NbtCompound());
        }
    }
}
