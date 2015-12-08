// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

public final class q
{

    public static final q a = new q("AZTEC");
    public static final q b = new q("CODABAR");
    public static final q c = new q("CODE_39");
    public static final q d = new q("CODE_93");
    public static final q e = new q("CODE_128");
    public static final q f = new q("DATA_MATRIX");
    public static final q g = new q("EAN_8");
    public static final q h = new q("EAN_13");
    public static final q i = new q("ITF");
    public static final q j = new q("PDF_417");
    public static final q k = new q("QR_CODE");
    public static final q l = new q("RSS_14");
    public static final q m = new q("RSS_EXPANDED");
    public static final q n = new q("UPC_A");
    public static final q o = new q("UPC_E");
    public static final q p = new q("UPC_EAN_EXTENSION");
    private static final Hashtable q = new Hashtable();
    private final String r;

    private q(String s)
    {
        r = s;
        q.put(s, this);
    }

    public final String toString()
    {
        return r;
    }

}
