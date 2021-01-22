/*
 * Copyright (c) 2020 BaeHyeonWoo
 *
 *  Licensed under the General Public License, Version 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/gpl-3.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package works.baehyeonwoo.musicplay0r.commands

import org.bukkit.ChatColor
import org.bukkit.SoundCategory
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter
import org.bukkit.entity.Player

/**
 * @author BaeHyeonWoo
 */

class MusicCommand : CommandExecutor, TabCompleter {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender is Player) {
            if (args.count() == 2) {
                sender.stopSound("frums.absolutezero", SoundCategory.MASTER)
                sender.stopSound("frums.icantevenremembermyownname", SoundCategory.MASTER)
                sender.stopSound("frums.jamwithpancake", SoundCategory.MASTER)
                sender.stopSound("frums.wing", SoundCategory.MASTER)
                sender.stopSound("frums.vigorlinesyoked", SoundCategory.MASTER)
                sender.stopSound("frums.lostinnewblankness", SoundCategory.MASTER)
                sender.stopSound("frums.mycapacitance", SoundCategory.MASTER)
                sender.stopSound("frums.salmiakki", SoundCategory.MASTER)
                sender.stopSound("frums.24eeev0", SoundCategory.MASTER)
                sender.stopSound("frums.greatfuryofheaven", SoundCategory.MASTER)
                sender.stopSound("frums.flashbacklog", SoundCategory.MASTER)
                sender.stopSound("frums.mdrqnxtagon", SoundCategory.MASTER)
                sender.stopSound("frums.fromthehazeofourraggedhypoxias", SoundCategory.MASTER)
                sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] You found the easter egg of this plugin. Congratulations.")
                sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] Now Playing: ${ChatColor.BOLD}Frums - Pictured as Pefect and Plus")
                sender.playSound(sender.location, "frums.papp", 1001F, 1F)
            }
            if (args.count() == 1) {
                args[0].let {
                    when (it) {
                        "1" -> {
                            sender.stopSound("frums.papp", SoundCategory.MASTER)
                            sender.stopSound("frums.absolutezero", SoundCategory.MASTER)
                            sender.stopSound("frums.icantevenremembermyownname", SoundCategory.MASTER)
                            sender.stopSound("frums.jamwithpancake", SoundCategory.MASTER)
                            sender.stopSound("frums.wing", SoundCategory.MASTER)
                            sender.stopSound("frums.vigorlinesyoked", SoundCategory.MASTER)
                            sender.stopSound("frums.lostinnewblankness", SoundCategory.MASTER)
                            sender.stopSound("frums.mycapacitance", SoundCategory.MASTER)
                            sender.stopSound("frums.salmiakki", SoundCategory.MASTER)
                            sender.stopSound("frums.24eeev0", SoundCategory.MASTER)
                            sender.stopSound("frums.greatfuryofheaven", SoundCategory.MASTER)
                            sender.stopSound("frums.flashbacklog", SoundCategory.MASTER)
                            sender.stopSound("frums.mdrqnxtagon", SoundCategory.MASTER)
                            sender.stopSound("frums.fromthehazeofourraggedhypoxias", SoundCategory.MASTER)
                            sender.playSound(sender.location, "frums.absolutezero", 1001F, 1F)
                            sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] Now Playing: ${ChatColor.BOLD}Frums - Absolute Zero")
                        }
                        "2" -> {
                            sender.stopSound("frums.papp", SoundCategory.MASTER)
                            sender.stopSound("frums.absolutezero", SoundCategory.MASTER)
                            sender.stopSound("frums.icantevenremembermyownname", SoundCategory.MASTER)
                            sender.stopSound("frums.jamwithpancake", SoundCategory.MASTER)
                            sender.stopSound("frums.wing", SoundCategory.MASTER)
                            sender.stopSound("frums.vigorlinesyoked", SoundCategory.MASTER)
                            sender.stopSound("frums.lostinnewblankness", SoundCategory.MASTER)
                            sender.stopSound("frums.mycapacitance", SoundCategory.MASTER)
                            sender.stopSound("frums.salmiakki", SoundCategory.MASTER)
                            sender.stopSound("frums.24eeev0", SoundCategory.MASTER)
                            sender.stopSound("frums.greatfuryofheaven", SoundCategory.MASTER)
                            sender.stopSound("frums.flashbacklog", SoundCategory.MASTER)
                            sender.stopSound("frums.mdrqnxtagon", SoundCategory.MASTER)
                            sender.stopSound("frums.fromthehazeofourraggedhypoxias", SoundCategory.MASTER)
                            sender.playSound(sender.location, "frums.icantevenremembermyownname", 1001F, 1F)
                            sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] Now Playing: ${ChatColor.BOLD}Frums - I Can't Even Remember My Own Name")
                        }
                        "3" -> {
                            sender.stopSound("frums.papp", SoundCategory.MASTER)
                            sender.stopSound("frums.absolutezero", SoundCategory.MASTER)
                            sender.stopSound("frums.icantevenremembermyownname", SoundCategory.MASTER)
                            sender.stopSound("frums.jamwithpancake", SoundCategory.MASTER)
                            sender.stopSound("frums.wing", SoundCategory.MASTER)
                            sender.stopSound("frums.vigorlinesyoked", SoundCategory.MASTER)
                            sender.stopSound("frums.lostinnewblankness", SoundCategory.MASTER)
                            sender.stopSound("frums.mycapacitance", SoundCategory.MASTER)
                            sender.stopSound("frums.salmiakki", SoundCategory.MASTER)
                            sender.stopSound("frums.24eeev0", SoundCategory.MASTER)
                            sender.stopSound("frums.greatfuryofheaven", SoundCategory.MASTER)
                            sender.stopSound("frums.flashbacklog", SoundCategory.MASTER)
                            sender.stopSound("frums.mdrqnxtagon", SoundCategory.MASTER)
                            sender.stopSound("frums.fromthehazeofourraggedhypoxias", SoundCategory.MASTER)
                            sender.playSound(sender.location, "frums.jamwithpancake", 1001F, 1F)
                            sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] Now Playing: ${ChatColor.BOLD}Frums - Jam with Pancake")
                        }
                        "4" -> {
                            sender.stopSound("frums.papp", SoundCategory.MASTER)
                            sender.stopSound("frums.absolutezero", SoundCategory.MASTER)
                            sender.stopSound("frums.icantevenremembermyownname", SoundCategory.MASTER)
                            sender.stopSound("frums.jamwithpancake", SoundCategory.MASTER)
                            sender.stopSound("frums.wing", SoundCategory.MASTER)
                            sender.stopSound("frums.vigorlinesyoked", SoundCategory.MASTER)
                            sender.stopSound("frums.lostinnewblankness", SoundCategory.MASTER)
                            sender.stopSound("frums.mycapacitance", SoundCategory.MASTER)
                            sender.stopSound("frums.salmiakki", SoundCategory.MASTER)
                            sender.stopSound("frums.24eeev0", SoundCategory.MASTER)
                            sender.stopSound("frums.greatfuryofheaven", SoundCategory.MASTER)
                            sender.stopSound("frums.flashbacklog", SoundCategory.MASTER)
                            sender.stopSound("frums.mdrqnxtagon", SoundCategory.MASTER)
                            sender.stopSound("frums.fromthehazeofourraggedhypoxias", SoundCategory.MASTER)
                            sender.playSound(sender.location, "frums.wing", 1001F, 1F)
                            sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] Now Playing: ${ChatColor.BOLD}Frums - wing")
                        }
                        "5" -> {
                            sender.stopSound("frums.papp", SoundCategory.MASTER)
                            sender.stopSound("frums.absolutezero", SoundCategory.MASTER)
                            sender.stopSound("frums.icantevenremembermyownname", SoundCategory.MASTER)
                            sender.stopSound("frums.jamwithpancake", SoundCategory.MASTER)
                            sender.stopSound("frums.wing", SoundCategory.MASTER)
                            sender.stopSound("frums.vigorlinesyoked", SoundCategory.MASTER)
                            sender.stopSound("frums.lostinnewblankness", SoundCategory.MASTER)
                            sender.stopSound("frums.mycapacitance", SoundCategory.MASTER)
                            sender.stopSound("frums.salmiakki", SoundCategory.MASTER)
                            sender.stopSound("frums.24eeev0", SoundCategory.MASTER)
                            sender.stopSound("frums.greatfuryofheaven", SoundCategory.MASTER)
                            sender.stopSound("frums.flashbacklog", SoundCategory.MASTER)
                            sender.stopSound("frums.mdrqnxtagon", SoundCategory.MASTER)
                            sender.stopSound("frums.fromthehazeofourraggedhypoxias", SoundCategory.MASTER)
                            sender.playSound(sender.location, "frums.vigorlinesyoked", 1001F, 1F)
                            sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] Now Playing: ${ChatColor.BOLD}Frums - Vigor Lines Yoked")
                        }
                        "6" -> {
                            sender.stopSound("frums.papp", SoundCategory.MASTER)
                            sender.stopSound("frums.absolutezero", SoundCategory.MASTER)
                            sender.stopSound("frums.icantevenremembermyownname", SoundCategory.MASTER)
                            sender.stopSound("frums.jamwithpancake", SoundCategory.MASTER)
                            sender.stopSound("frums.wing", SoundCategory.MASTER)
                            sender.stopSound("frums.vigorlinesyoked", SoundCategory.MASTER)
                            sender.stopSound("frums.lostinnewblankness", SoundCategory.MASTER)
                            sender.stopSound("frums.mycapacitance", SoundCategory.MASTER)
                            sender.stopSound("frums.salmiakki", SoundCategory.MASTER)
                            sender.stopSound("frums.24eeev0", SoundCategory.MASTER)
                            sender.stopSound("frums.greatfuryofheaven", SoundCategory.MASTER)
                            sender.stopSound("frums.flashbacklog", SoundCategory.MASTER)
                            sender.stopSound("frums.mdrqnxtagon", SoundCategory.MASTER)
                            sender.stopSound("frums.fromthehazeofourraggedhypoxias", SoundCategory.MASTER)
                            sender.playSound(sender.location, "frums.lostinnewblankness", 1001F, 1F)
                            sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] Now Playing: ${ChatColor.BOLD}Frums - lost in new blankness")
                        }
                        "7" -> {
                            sender.stopSound("frums.papp", SoundCategory.MASTER)
                            sender.stopSound("frums.absolutezero", SoundCategory.MASTER)
                            sender.stopSound("frums.icantevenremembermyownname", SoundCategory.MASTER)
                            sender.stopSound("frums.jamwithpancake", SoundCategory.MASTER)
                            sender.stopSound("frums.wing", SoundCategory.MASTER)
                            sender.stopSound("frums.vigorlinesyoked", SoundCategory.MASTER)
                            sender.stopSound("frums.lostinnewblankness", SoundCategory.MASTER)
                            sender.stopSound("frums.mycapacitance", SoundCategory.MASTER)
                            sender.stopSound("frums.salmiakki", SoundCategory.MASTER)
                            sender.stopSound("frums.24eeev0", SoundCategory.MASTER)
                            sender.stopSound("frums.greatfuryofheaven", SoundCategory.MASTER)
                            sender.stopSound("frums.flashbacklog", SoundCategory.MASTER)
                            sender.stopSound("frums.mdrqnxtagon", SoundCategory.MASTER)
                            sender.stopSound("frums.fromthehazeofourraggedhypoxias", SoundCategory.MASTER)
                            sender.playSound(sender.location, "frums.mycapacitance", 1001F, 1F)
                            sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] Now Playing: ${ChatColor.BOLD}Frums - My Capacitance")
                        }
                        "8" -> {
                            sender.stopSound("frums.papp", SoundCategory.MASTER)
                            sender.stopSound("frums.absolutezero", SoundCategory.MASTER)
                            sender.stopSound("frums.icantevenremembermyownname", SoundCategory.MASTER)
                            sender.stopSound("frums.jamwithpancake", SoundCategory.MASTER)
                            sender.stopSound("frums.wing", SoundCategory.MASTER)
                            sender.stopSound("frums.vigorlinesyoked", SoundCategory.MASTER)
                            sender.stopSound("frums.lostinnewblankness", SoundCategory.MASTER)
                            sender.stopSound("frums.mycapacitance", SoundCategory.MASTER)
                            sender.stopSound("frums.salmiakki", SoundCategory.MASTER)
                            sender.stopSound("frums.24eeev0", SoundCategory.MASTER)
                            sender.stopSound("frums.greatfuryofheaven", SoundCategory.MASTER)
                            sender.stopSound("frums.flashbacklog", SoundCategory.MASTER)
                            sender.stopSound("frums.mdrqnxtagon", SoundCategory.MASTER)
                            sender.stopSound("frums.fromthehazeofourraggedhypoxias", SoundCategory.MASTER)
                            sender.playSound(sender.location, "frums.salmiakki", 1001F, 1F)
                            sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] Now Playing: ${ChatColor.BOLD}Frums - Salmiakki")
                        }
                        "9" -> {
                            sender.stopSound("frums.papp", SoundCategory.MASTER)
                            sender.stopSound("frums.absolutezero", SoundCategory.MASTER)
                            sender.stopSound("frums.icantevenremembermyownname", SoundCategory.MASTER)
                            sender.stopSound("frums.jamwithpancake", SoundCategory.MASTER)
                            sender.stopSound("frums.wing", SoundCategory.MASTER)
                            sender.stopSound("frums.vigorlinesyoked", SoundCategory.MASTER)
                            sender.stopSound("frums.lostinnewblankness", SoundCategory.MASTER)
                            sender.stopSound("frums.mycapacitance", SoundCategory.MASTER)
                            sender.stopSound("frums.salmiakki", SoundCategory.MASTER)
                            sender.stopSound("frums.24eeev0", SoundCategory.MASTER)
                            sender.stopSound("frums.greatfuryofheaven", SoundCategory.MASTER)
                            sender.stopSound("frums.flashbacklog", SoundCategory.MASTER)
                            sender.stopSound("frums.mdrqnxtagon", SoundCategory.MASTER)
                            sender.stopSound("frums.fromthehazeofourraggedhypoxias", SoundCategory.MASTER)
                            sender.playSound(sender.location, "frums.24eeev0", 1001F, 1F)
                            sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] Now Playing: ${ChatColor.BOLD}Frums - 24eeev0-$")
                        }
                        "10" -> {
                            sender.stopSound("frums.papp", SoundCategory.MASTER)
                            sender.stopSound("frums.absolutezero", SoundCategory.MASTER)
                            sender.stopSound("frums.icantevenremembermyownname", SoundCategory.MASTER)
                            sender.stopSound("frums.jamwithpancake", SoundCategory.MASTER)
                            sender.stopSound("frums.wing", SoundCategory.MASTER)
                            sender.stopSound("frums.vigorlinesyoked", SoundCategory.MASTER)
                            sender.stopSound("frums.lostinnewblankness", SoundCategory.MASTER)
                            sender.stopSound("frums.mycapacitance", SoundCategory.MASTER)
                            sender.stopSound("frums.salmiakki", SoundCategory.MASTER)
                            sender.stopSound("frums.24eeev0", SoundCategory.MASTER)
                            sender.stopSound("frums.greatfuryofheaven", SoundCategory.MASTER)
                            sender.stopSound("frums.flashbacklog", SoundCategory.MASTER)
                            sender.stopSound("frums.mdrqnxtagon", SoundCategory.MASTER)
                            sender.stopSound("frums.fromthehazeofourraggedhypoxias", SoundCategory.MASTER)
                            sender.playSound(sender.location, "frums.greatfuryofheaven", 1001F, 1F)
                            sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] Now Playing: ${ChatColor.BOLD}Frums - Great Fury of Heaven")
                        }
                        "11" -> {
                            sender.stopSound("frums.papp", SoundCategory.MASTER)
                            sender.stopSound("frums.absolutezero", SoundCategory.MASTER)
                            sender.stopSound("frums.icantevenremembermyownname", SoundCategory.MASTER)
                            sender.stopSound("frums.jamwithpancake", SoundCategory.MASTER)
                            sender.stopSound("frums.wing", SoundCategory.MASTER)
                            sender.stopSound("frums.vigorlinesyoked", SoundCategory.MASTER)
                            sender.stopSound("frums.lostinnewblankness", SoundCategory.MASTER)
                            sender.stopSound("frums.mycapacitance", SoundCategory.MASTER)
                            sender.stopSound("frums.salmiakki", SoundCategory.MASTER)
                            sender.stopSound("frums.24eeev0", SoundCategory.MASTER)
                            sender.stopSound("frums.greatfuryofheaven", SoundCategory.MASTER)
                            sender.stopSound("frums.flashbacklog", SoundCategory.MASTER)
                            sender.stopSound("frums.mdrqnxtagon", SoundCategory.MASTER)
                            sender.stopSound("frums.fromthehazeofourraggedhypoxias", SoundCategory.MASTER)
                            sender.playSound(sender.location, "frums.flashbacklog", 1001F, 1F)
                            sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] Now Playing: ${ChatColor.BOLD}Frums - Flashbacklog")
                        }
                        "12" -> {
                            sender.stopSound("frums.papp", SoundCategory.MASTER)
                            sender.stopSound("frums.absolutezero", SoundCategory.MASTER)
                            sender.stopSound("frums.icantevenremembermyownname", SoundCategory.MASTER)
                            sender.stopSound("frums.jamwithpancake", SoundCategory.MASTER)
                            sender.stopSound("frums.wing", SoundCategory.MASTER)
                            sender.stopSound("frums.vigorlinesyoked", SoundCategory.MASTER)
                            sender.stopSound("frums.lostinnewblankness", SoundCategory.MASTER)
                            sender.stopSound("frums.mycapacitance", SoundCategory.MASTER)
                            sender.stopSound("frums.salmiakki", SoundCategory.MASTER)
                            sender.stopSound("frums.24eeev0", SoundCategory.MASTER)
                            sender.stopSound("frums.greatfuryofheaven", SoundCategory.MASTER)
                            sender.stopSound("frums.flashbacklog", SoundCategory.MASTER)
                            sender.stopSound("frums.mdrqnxtagon", SoundCategory.MASTER)
                            sender.stopSound("frums.fromthehazeofourraggedhypoxias", SoundCategory.MASTER)
                            sender.playSound(sender.location, "frums.mdrqnxtagon", 1001F, 1F)
                            sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] Now Playing: ${ChatColor.BOLD}Frums - Mdrqnxtagon")
                        }
                        "13" -> {
                            sender.stopSound("frums.papp", SoundCategory.MASTER)
                            sender.stopSound("frums.absolutezero", SoundCategory.MASTER)
                            sender.stopSound("frums.icantevenremembermyownname", SoundCategory.MASTER)
                            sender.stopSound("frums.jamwithpancake", SoundCategory.MASTER)
                            sender.stopSound("frums.wing", SoundCategory.MASTER)
                            sender.stopSound("frums.vigorlinesyoked", SoundCategory.MASTER)
                            sender.stopSound("frums.lostinnewblankness", SoundCategory.MASTER)
                            sender.stopSound("frums.mycapacitance", SoundCategory.MASTER)
                            sender.stopSound("frums.salmiakki", SoundCategory.MASTER)
                            sender.stopSound("frums.24eeev0", SoundCategory.MASTER)
                            sender.stopSound("frums.greatfuryofheaven", SoundCategory.MASTER)
                            sender.stopSound("frums.flashbacklog", SoundCategory.MASTER)
                            sender.stopSound("frums.mdrqnxtagon", SoundCategory.MASTER)
                            sender.stopSound("frums.fromthehazeofourraggedhypoxias", SoundCategory.MASTER)
                            sender.playSound(sender.location, "frums.fromthehazeofourraggedhypoxias", 1001F, 1F)
                            sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] Now Playing: ${ChatColor.BOLD}Frums - from the haze of our ragged hypoxias")
                        }
                        "stop" -> {
                            sender.stopSound("frums.papp", SoundCategory.MASTER)
                            sender.stopSound("frums.absolutezero", SoundCategory.MASTER)
                            sender.stopSound("frums.icantevenremembermyownname", SoundCategory.MASTER)
                            sender.stopSound("frums.jamwithpancake", SoundCategory.MASTER)
                            sender.stopSound("frums.wing", SoundCategory.MASTER)
                            sender.stopSound("frums.vigorlinesyoked", SoundCategory.MASTER)
                            sender.stopSound("frums.lostinnewblankness", SoundCategory.MASTER)
                            sender.stopSound("frums.mycapacitance", SoundCategory.MASTER)
                            sender.stopSound("frums.salmiakki", SoundCategory.MASTER)
                            sender.stopSound("frums.24eeev0", SoundCategory.MASTER)
                            sender.stopSound("frums.greatfuryofheaven", SoundCategory.MASTER)
                            sender.stopSound("frums.flashbacklog", SoundCategory.MASTER)
                            sender.stopSound("frums.mdrqnxtagon", SoundCategory.MASTER)
                            sender.stopSound("frums.fromthehazeofourraggedhypoxias", SoundCategory.MASTER)
                            sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] Stopped the music.")
                        }
                        else -> {
                            sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] ${ChatColor.WHITE}Current Musics:\n" +
                                    "1. Frums - Absolute Zero\n" +
                                    "2. Frums - I Can't Even Remember My Own Name\n" +
                                    "3. Frums - Jam with Pancake\n" +
                                    "4. Frums - wing\n" +
                                    "5. Frums - vigorlinesyoked\n" +
                                    "6. Frums - lost in new blankness\n" +
                                    "7. Frums - My Capacitance\n" +
                                    "8. Frums - Salmiakki\n" +
                                    "9. Frums - 24eeev0-$\n" +
                                    "10. Frums - Great Fury of Heaven\n" +
                                    "11. Frums - Flashbacklog\n" +
                                    "12. Frums - Mdrgnxtagon\n" +
                                    "13. Frums - from the haze of our ragged hypoxias")
                            return true
                        }
                    }
                }
            }
                else {
                    sender.sendMessage("${ChatColor.GREEN}[MusicPlay0r] ${ChatColor.RED}Incorrect arguments. Usage : /music [MusicNumber]\n" +
                            "${ChatColor.WHITE}Current Musics:" +
                            "1. Frums - Absolute Zero\n" +
                            "2. Frums - I Can't Even Remember My Own Name\n" +
                            "3. Frums - Jam with Pancake\n" +
                            "4. Frums - wing\n" +
                            "5. Frums - vigorlinesyoked\n" +
                            "6. Frums - lost in new blankness\n" +
                            "7. Frums - My Capacitance\n" +
                            "8. Frums - Salmiakki\n" +
                            "9. Frums - 24eeev0-$\n" +
                            "10. Frums - Great Fury of Heaven\n" +
                            "11. Frums - Flashbacklog\n" +
                            "12. Frums - Mdrgnxtagon\n" +
                            "13. Frums - from the haze of our ragged hypoxias\n" +
                            "Use /music stop to stop.")
            }
        } else {
            sender.sendMessage("${ChatColor.GREEN}[ColorName] ${ChatColor.RED}Please use this command in-game.")
        }
        return true
    }

    override fun onTabComplete(sender: CommandSender, command: Command, alias: String, args: Array<out String>): List<String> {
        return emptyList()
    }
}
