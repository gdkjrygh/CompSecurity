// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            ElementThunker

static class 
{

    static final int $SwitchMap$android$support$v8$renderscript$Element$DataKind[];
    static final int $SwitchMap$android$support$v8$renderscript$Element$DataType[];

    static 
    {
        $SwitchMap$android$support$v8$renderscript$Element$DataType = new int[values().length];
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror25) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[FLOAT_32.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror24) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[FLOAT_64.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror23) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[SIGNED_8.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror22) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[SIGNED_16.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror21) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[SIGNED_32.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror20) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[SIGNED_64.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[UNSIGNED_8.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[UNSIGNED_16.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[UNSIGNED_32.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[UNSIGNED_64.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[BOOLEAN.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[MATRIX_4X4.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[MATRIX_3X3.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[MATRIX_2X2.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[RS_ELEMENT.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[RS_TYPE.ordinal()] = 17;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[RS_ALLOCATION.ordinal()] = 18;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[RS_SAMPLER.ordinal()] = 19;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[RS_SCRIPT.ordinal()] = 20;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        $SwitchMap$android$support$v8$renderscript$Element$DataKind = new int[values().length];
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataKind[USER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataKind[PIXEL_L.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataKind[PIXEL_A.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataKind[PIXEL_LA.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataKind[PIXEL_RGB.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataKind[PIXEL_RGBA.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
