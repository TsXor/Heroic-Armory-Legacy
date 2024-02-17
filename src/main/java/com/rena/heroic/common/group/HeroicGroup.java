package com.rena.heroic.common.group;

import com.rena.heroic.core.init.ItemInit;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

/* loaded from: heroic_armory_legacy-1.5.jar:com/rena/heroic/common/group/HeroicGroup.class */
public class HeroicGroup extends ItemGroup {
    public static final ItemGroup WEAPONS = new HeroicGroup("weapons", ItemInit.LOTRGIMLIBATTLEAX);

    private final Supplier<? extends IItemProvider> iconItemSupplier;

    private HeroicGroup(String name, Supplier<? extends IItemProvider> iconItemSupplier) {
        super("heroic." + name);
        this.iconItemSupplier = iconItemSupplier;
    }

    @Nonnull
    public ItemStack makeIcon() {
        return iconItemSupplier.get().asItem().getDefaultInstance();
    }
}
