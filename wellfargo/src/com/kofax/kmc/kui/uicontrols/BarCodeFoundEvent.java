// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.Image;
import java.util.EventObject;

public class BarCodeFoundEvent extends EventObject
{

    private static final long serialVersionUID = 0x1183bd8c4384b77cL;
    private BarCodeResult a;
    private Image b;

    public BarCodeFoundEvent(Object obj, BarCodeResult barcoderesult, Image image)
    {
        super(obj);
        a = barcoderesult;
        b = image;
    }

    public BarCodeResult getBarCode()
    {
        return a;
    }

    public Image getImage()
    {
        return b;
    }
}
