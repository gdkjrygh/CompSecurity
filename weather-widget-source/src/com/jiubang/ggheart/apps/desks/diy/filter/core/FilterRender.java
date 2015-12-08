// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.ggheart.apps.desks.diy.filter.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;

// Referenced classes of package com.jiubang.ggheart.apps.desks.diy.filter.core:
//            AbsFilterHandler, OriginalHandler, ClothHandler, BlackWhiteHandler, 
//            ColorToneHandler, SunshineHandler, SketchHandler, CloudyHandler, 
//            GaussianBlurHandler, BrightcontrastHandler, NeonHandler, MilkHandler, 
//            SunriseHandler, SunSetHandler, FilmHandler, FilterParameter

public class FilterRender
{

    private final SparseArray a = new SparseArray();
    private Context b;

    protected FilterRender(Context context)
    {
        b = context;
    }

    private AbsFilterHandler a(int i)
    {
        AbsFilterHandler absfilterhandler = (AbsFilterHandler)a.get(i);
        Object obj = absfilterhandler;
        if (absfilterhandler == null)
        {
            if (OriginalHandler.canHandle(i))
            {
                obj = new OriginalHandler();
            } else
            if (ClothHandler.canHandle(i))
            {
                obj = new ClothHandler();
            } else
            if (BlackWhiteHandler.canHandle(i))
            {
                obj = new BlackWhiteHandler();
            } else
            if (ColorToneHandler.canHandle(i))
            {
                obj = new ColorToneHandler();
            } else
            if (SunshineHandler.canHandle(i))
            {
                obj = new SunshineHandler();
            } else
            if (SketchHandler.canHandle(i))
            {
                obj = new SketchHandler();
            } else
            if (CloudyHandler.canHandle(i))
            {
                obj = new CloudyHandler();
            } else
            if (GaussianBlurHandler.canHandle(i))
            {
                obj = new GaussianBlurHandler();
            } else
            if (BrightcontrastHandler.canHandle(i))
            {
                obj = new BrightcontrastHandler();
            } else
            if (NeonHandler.canHandle(i))
            {
                obj = new NeonHandler();
            } else
            if (MilkHandler.canHandle(i))
            {
                obj = new MilkHandler(b);
            } else
            if (SunriseHandler.canHandle(i))
            {
                obj = new SunriseHandler(b);
            } else
            if (SunSetHandler.canHandle(i))
            {
                obj = new SunSetHandler(b);
            } else
            if (FilmHandler.canHandle(i))
            {
                obj = new FilmHandler(b);
            } else
            {
                throw new IllegalAccessError((new StringBuilder()).append("AbsFilterHandler\uFF1AIs typeId=").append(i).append(" a new type?").toString());
            }
            a.append(i, obj);
        }
        return ((AbsFilterHandler) (obj));
    }

    public void cleanUp()
    {
        if (a != null)
        {
            a.clear();
        }
    }

    public Bitmap render(FilterParameter filterparameter)
    {
        AbsFilterHandler absfilterhandler;
        if (filterparameter != null)
        {
            if ((absfilterhandler = a(filterparameter.getTypeId())) != null)
            {
                return absfilterhandler.handler(filterparameter);
            }
        }
        return null;
    }
}
