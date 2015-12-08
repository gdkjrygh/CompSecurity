// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Cache;
import com.android.volley.VolleyLog;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DiskBasedCache
    implements Cache
{
    static class CacheHeader
    {

        public String etag;
        public String key;
        public Map responseHeaders;
        public long serverDate;
        public long size;
        public long softTtl;
        public long ttl;

        public static CacheHeader readHeader(InputStream inputstream)
            throws IOException
        {
            CacheHeader cacheheader = new CacheHeader();
            if (DiskBasedCache.readInt(inputstream) != 0x20120504)
            {
                throw new IOException();
            }
            cacheheader.key = DiskBasedCache.readString(inputstream);
            cacheheader.etag = DiskBasedCache.readString(inputstream);
            if (cacheheader.etag.equals(""))
            {
                cacheheader.etag = null;
            }
            cacheheader.serverDate = DiskBasedCache.readLong(inputstream);
            cacheheader.ttl = DiskBasedCache.readLong(inputstream);
            cacheheader.softTtl = DiskBasedCache.readLong(inputstream);
            cacheheader.responseHeaders = DiskBasedCache.readStringStringMap(inputstream);
            return cacheheader;
        }

        public com.android.volley.Cache.Entry toCacheEntry(byte abyte0[])
        {
            com.android.volley.Cache.Entry entry = new com.android.volley.Cache.Entry();
            entry.data = abyte0;
            entry.etag = etag;
            entry.serverDate = serverDate;
            entry.ttl = ttl;
            entry.softTtl = softTtl;
            entry.responseHeaders = responseHeaders;
            return entry;
        }

        public boolean writeHeader(OutputStream outputstream)
        {
            DiskBasedCache.writeInt(outputstream, 0x20120504);
            DiskBasedCache.writeString(outputstream, key);
            if (etag != null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            String s = "";
_L1:
            try
            {
                DiskBasedCache.writeString(outputstream, s);
                DiskBasedCache.writeLong(outputstream, serverDate);
                DiskBasedCache.writeLong(outputstream, ttl);
                DiskBasedCache.writeLong(outputstream, softTtl);
                DiskBasedCache.writeStringStringMap(responseHeaders, outputstream);
                outputstream.flush();
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                VolleyLog.d("%s", new Object[] {
                    outputstream.toString()
                });
                return false;
            }
            return true;
            s = etag;
              goto _L1
        }

        private CacheHeader()
        {
        }

        public CacheHeader(String s, com.android.volley.Cache.Entry entry)
        {
            key = s;
            size = entry.data.length;
            etag = entry.etag;
            serverDate = entry.serverDate;
            ttl = entry.ttl;
            softTtl = entry.softTtl;
            responseHeaders = entry.responseHeaders;
        }
    }

    private static class CountingInputStream extends FilterInputStream
    {

        private int bytesRead;

        public int read()
            throws IOException
        {
            int i = super.read();
            if (i != -1)
  