package io.github.changedmc.turned.gamerule;

import io.github.changedmc.turned.util.GamerulesUtility;
import net.minecraft.world.level.GameRules;

public class TurnedGamerules {
    public static final GameRules.Key<GameRules.BooleanValue> RULE_DO_DARK_LATEX_SPREAD = GameRules.register("doDarkLatexSpread", GameRules.Category.UPDATES, GamerulesUtility.BooleanValue.create(true));
    public static final GameRules.Key<GameRules.BooleanValue> RULE_DO_WHITE_LATEX_SPREAD = GameRules.register("doWhiteLatexSpread", GameRules.Category.UPDATES, GamerulesUtility.BooleanValue.create(true));
}
