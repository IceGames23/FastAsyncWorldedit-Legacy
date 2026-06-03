/*
 * Minimal compile-only API stub for BlocksHub v2.0 (org.primesoft:BlocksHub:2.0).
 *
 * The upstream artifact is no longer downloadable (repos return 403 and the
 * GitHub repo was archived). This stub mirrors ONLY the exact API surface that
 * FastAsyncWorldEdit references, with descriptors identical to the real v2.0
 * classes, so FAWE compiles against it. It is declared `compileOnly` and is NOT
 * shipped in the plugin jar — at runtime the real classes are provided by the
 * installed BlocksHub plugin.
 *
 * Source of truth: https://github.com/SBPrime/BlocksHub tag v2.0
 */
package org.primesoft.blockshub;

import java.util.UUID;
import org.primesoft.blockshub.api.BlockData;
import org.primesoft.blockshub.api.IPlayer;
import org.primesoft.blockshub.api.IWorld;
import org.primesoft.blockshub.api.Vector;

public interface IBlocksHubApi {

    IPlayer getPlayer(UUID uuid);

    IWorld getWorld(String name);

    void logBlock(Vector location, IPlayer player, IWorld world,
            BlockData oldBlock, BlockData newBlock);
}
