package com.eaglesakura.geo;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeohashTest {
    @Test
    public void Geohash変換で有効な文字が返却される() {
        String geohash = Geohash.encode(30, 120);
        assertNotNull(geohash);
        assertFalse(geohash.isEmpty());
    }

    @Test
    public void Geohash変換で規定の文字数となる() {
        assertEquals(Geohash.encode(30, 120, 8).length(), 8);
    }
}
