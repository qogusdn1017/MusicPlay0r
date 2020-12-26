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

package works.baehyeonwoo.musicplay0r

import org.bukkit.plugin.java.JavaPlugin
import works.baehyeonwoo.musicplay0r.commands.MusicCommand

/**
 * @author BaeHyeonWoo
 */

class MusicMain : JavaPlugin() {
    override fun onEnable() {
        getCommand("music")?.setExecutor(MusicCommand())
        getCommand("music")?.tabCompleter = MusicCommand()
    }
}