// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.utils.settings;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.wsi.android.framework.settings.helpers.MapViewType;

// Referenced classes of package com.wsi.android.weather.utils.settings:
//            MapSkinParser

public class MapSkinSettings
{

    protected final String TAG = getClass().getSimpleName();
    private int backgroundAlpha;
    private int backgroundImage;
    protected Context context;
    private MapViewType mapViewType;

    public MapSkinSettings(int i, Context context1)
        throws android.content.res.Resources.NotFoundException
    {
        mapViewType = MapViewType.HYBRID;
        backgroundImage = -1;
        context = context1;
        MapSkinParser mapskinparser = createSkinParser();
        try
        {
            mapskinparser.parse(context1.getResources().openRawResource(i));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            Log.e(TAG, "SkinSettings: unable to parse skin.xml", context1);
        }
    }

    protected MapSkinParser createSkinParser()
    {
        return new MapSkinParser(this);
    }

    public Drawable getBackgroundImage()
    {
        if (backgroundImage == -1)
        {
            return null;
        } else
        {
            Drawable drawable = context.getResources().getDrawable(backgroundImage);
            drawable.setAlpha(backgroundAlpha);
            return drawable;
        }
    }

    public MapViewType getMapViewType()
    {
        return mapViewType;
    }

    void setBackgroundImage(int i, int j)
    {
        backgroundImage = i;
        backgroundAlpha = j;
    }

    public void setMapViewType(MapViewType mapviewtype)
    {
        mapViewType = mapviewtype;
    }
}
