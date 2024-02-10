package net.pedroricardo.content;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import io.wispforest.owo.config.Option;
import net.minecraft.command.CommandSource;
import net.minecraft.text.Text;
import net.pedroricardo.HeadedRewritten;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class HeadOptionArgumentType implements ArgumentType<Option<Object>> {
    public static final DynamicCommandExceptionType INVALID_HEAD_OPTION_EXCEPTION = new DynamicCommandExceptionType((head) -> Text.stringifiedTranslatable("argument." + HeadedRewritten.MOD_ID + ".head_option.invalid", head));

    public static HeadOptionArgumentType head() {
        return new HeadOptionArgumentType();
    }

    public static Option<Object> getHeadOption(CommandContext<?> context, String name) {
        return (Option<Object>) context.getArgument(name, Option.class);
    }

    @Override
    public Option<Object> parse(StringReader reader) throws CommandSyntaxException {
        String string = reader.readUnquotedString();
        Option<Object> option = HeadedRewritten.CONFIG.optionForKey(new Option.Key(string));
        if (option == null) {
            throw INVALID_HEAD_OPTION_EXCEPTION.create(string);
        }
        return option;
    }

    @Override
    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
        Collection<String> collection = new ArrayList<>();
        HeadedRewritten.CONFIG.allOptions().forEach((key, value) -> {
            if (key.asString().startsWith("headURLs.")) collection.add(key.asString());
        });
        return CommandSource.suggestMatching(collection, builder);
    }
}
