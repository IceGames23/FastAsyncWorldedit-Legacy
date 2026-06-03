/*
 * Minimal compile-only API stub for BlocksHub v2.0 — see IBlocksHubApi.java.
 * Descriptors match the real org.primesoft.blockshub.api.BlockData at tag v2.0:
 *   ctor (int type, int data), int getType(), int getData(), boolean isAir().
 * FAWE's MutableBlockData extends this and overrides the three getters.
 */
package org.primesoft.blockshub.api;

public class BlockData {

    public BlockData(int type, int data) {
    }

    public int getType() {
        return 0;
    }

    public int getData() {
        return 0;
    }

    public boolean isAir() {
        return false;
    }
}
