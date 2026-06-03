/*
 * Minimal compile-only API stub for BlocksHub v2.0 — see IBlocksHubApi.java.
 *
 * Real type is a JavaPlugin; FAWE only does ((BlocksHubBukkit) plugin).getApi(),
 * casting from the org.bukkit.plugin.Plugin INTERFACE, so a plain class with the
 * matching getApi() descriptor is enough to compile and links correctly to the
 * real class at runtime.
 */
package org.primesoft.blockshub;

public class BlocksHubBukkit {

    public IBlocksHubApi getApi() {
        return null;
    }
}
