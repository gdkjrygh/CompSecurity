// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.tiles.tessera;

import android.util.Log;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;

// Referenced classes of package com.wsi.android.framework.wxdata.tiles.tessera:
//            TileMap

public class TileMapsPool
{

    protected String TAG;
    private int nextTileMapIndex;
    private List tileMapsPool;

    public TileMapsPool(int i)
    {
        TAG = getClass().getSimpleName();
        nextTileMapIndex = -1;
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("TileMapsPool: creating tile maps pool; size = ").append(i).toString());
        }
        tileMapsPool = new ArrayList(i);
        for (int j = 0; j < i; j++)
        {
            tileMapsPool.add(new TileMap());
        }

    }

    protected TileMap getTileMap()
    {
        this;
        JVM INSTR monitorenter ;
        TileMap tilemap;
        int i = nextTileMapIndex + 1;
        nextTileMapIndex = i;
        if (i == tileMapsPool.size())
        {
            tileMapsPool.add(new TileMap());
            if (ConfigInfo.DEBUG)
            {
                Log.d(TAG, (new StringBuilder()).append("getTileMap: increased tile maps pool size to ").append(tileMapsPool.size()).toString());
            }
        }
        tilemap = (TileMap)tileMapsPool.get(nextTileMapIndex);
        this;
        JVM INSTR monitorexit ;
        return tilemap;
        Exception exception;
        exception;
        throw exception;
    }

    public TileMap getTileMap(String s, String s1, String s2, int i, int j, int ai[], int ai1[], 
            String s3, String s4, String s5)
    {
        TileMap tilemap = getTileMap();
        tilemap.setHref(s);
        tilemap.setVersion(s1);
        tilemap.setImageFormat(s2);
        tilemap.setMaxZoom(i);
        tilemap.setServerIndex(j);
        tilemap.setCacheModifiers(ai);
        tilemap.setIterations(ai1);
        tilemap.setCipher(s3);
        tilemap.setLayerId(s4);
        tilemap.setModelRun(s5);
        return tilemap;
    }

    public TileMap getTileMap(Attributes attributes)
    {
        TileMap tilemap = getTileMap();
        tilemap.setHref(attributes.getValue("", "href"));
        tilemap.setTitle(attributes.getValue("", "title"));
        tilemap.setVersion(attributes.getValue("", "version"));
        tilemap.setImageFormat(attributes.getValue("", "imageFormat"));
        tilemap.setMaxZoom(Integer.parseInt(attributes.getValue("", "maxZoom")));
        tilemap.setServerIndex(Integer.parseInt(attributes.getValue("", "startingServer")));
        tilemap.setServerQuantity(Integer.parseInt(attributes.getValue("", "serverAmount")));
        return tilemap;
    }

    public void resetNextTileMapIndex()
    {
        nextTileMapIndex = -1;
    }
}
