// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.data;


public final class CaptureMessage extends Enum
{

    public static final CaptureMessage APPROVE;
    public static final CaptureMessage CAPTURE;
    public static final CaptureMessage DECODE;
    public static final CaptureMessage DECODE_FAILED;
    public static final CaptureMessage DECODE_SUCCEEDED;
    public static final CaptureMessage FIND_PAGE;
    public static final CaptureMessage IMAGE_APPROVED;
    public static final CaptureMessage IMAGE_REJECTED;
    public static final CaptureMessage NOTREADY;
    public static final CaptureMessage QUIT;
    private static final CaptureMessage b[];
    private int a;

    private CaptureMessage(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static CaptureMessage valueOf(String s)
    {
        return (CaptureMessage)Enum.valueOf(com/kofax/kmc/kui/uicontrols/data/CaptureMessage, s);
    }

    public static CaptureMessage[] values()
    {
        return (CaptureMessage[])b.clone();
    }

    public int getValue()
    {
        return a;
    }

    static 
    {
        APPROVE = new CaptureMessage("APPROVE", 0, 0);
        IMAGE_APPROVED = new CaptureMessage("IMAGE_APPROVED", 1, 1);
        IMAGE_REJECTED = new CaptureMessage("IMAGE_REJECTED", 2, 2);
        QUIT = new CaptureMessage("QUIT", 3, 3);
        DECODE = new CaptureMessage("DECODE", 4, 4);
        DECODE_SUCCEEDED = new CaptureMessage("DECODE_SUCCEEDED", 5, 5);
        DECODE_FAILED = new CaptureMessage("DECODE_FAILED", 6, 6);
        CAPTURE = new CaptureMessage("CAPTURE", 7, 7);
        NOTREADY = new CaptureMessage("NOTREADY", 8, 8);
        FIND_PAGE = new CaptureMessage("FIND_PAGE", 9, 9);
        b = (new CaptureMessage[] {
            APPROVE, IMAGE_APPROVED, IMAGE_REJECTED, QUIT, DECODE, DECODE_SUCCEEDED, DECODE_FAILED, CAPTURE, NOTREADY, FIND_PAGE
        });
    }
}
