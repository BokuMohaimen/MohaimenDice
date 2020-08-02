package mohaimendice.mdice

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import kotlin.math.max
import kotlin.random.Random

object mohadice:CommandExecutor {
    fun rollDice(min: Int, max: Int): Int {
        val r = Random
        return r.nextInt(max - min + 1) + min
    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        val p = sender as Player
        if (args.isEmpty()){
            p.sendMessage("Usage: /mdice <数字>")
            return true
        }
        val max = args[0].toInt()
        val min:Int = 1
        val result = rollDice(min, max)
        Bukkit.broadcastMessage("§2§l[§a§lM§f§lDice§2§l] §b§l${p.displayName} §fは§b§l${max}面ダイスを回して§b§l${result}§fが出た！")
        return true
    }
}