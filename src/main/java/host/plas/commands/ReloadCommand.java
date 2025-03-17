package host.plas.commands;

import host.plas.MVInvExtras;
import host.plas.configs.MainConfig;
import net.streamline.api.command.ModuleCommand;
import net.streamline.api.command.StreamlineCommand;
import net.streamline.api.command.context.CommandContext;

public class ReloadCommand extends ModuleCommand {
    public ReloadCommand() {
        super(MVInvExtras.getInstance(), "reloadmvinve", "streamline.command.reloadquests.default", "relmie", "rlm");
    }

    @Override
    public void run(CommandContext<StreamlineCommand> context) {
        context.sendMessage("&eReloading &a" + MainConfig.getWorldActions().size() + " &eworld actions&8...");

        MVInvExtras.getExampleConfig().reloadConfig();

        context.sendMessage("&aLoaded &e" + MainConfig.getWorldActions().size() + " &eworld actions&8.");
    }
}
