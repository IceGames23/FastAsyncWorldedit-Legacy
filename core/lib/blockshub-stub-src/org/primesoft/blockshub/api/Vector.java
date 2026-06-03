/*
 * Minimal compile-only API stub for BlocksHub v2.0 — see IBlocksHubApi.java.
 * Descriptors match the real org.primesoft.blockshub.api.Vector at tag v2.0:
 *   ctor (double x, double y, double z), double getX()/getY()/getZ().
 * FAWE's MutableVector extends this and overrides the three getters.
 */
package org.primesoft.blockshub.api;

public class Vector {

    public Vector(double x, double y, double z) {
    }

    public double getX() {
        return 0;
    }

    public double getY() {
        return 0;
    }

    public double getZ() {
        return 0;
    }
}
