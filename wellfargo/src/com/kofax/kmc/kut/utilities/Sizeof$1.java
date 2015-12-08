// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities;


class jectDataTypes
{

    static final int a[];

    static 
    {
        a = new int[jectDataTypes.values().length];
        try
        {
            a[jectDataTypes.DATA_TYPE_OBJECT_SHELL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            a[jectDataTypes.DATA_TYPE_OBJECT_REF.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            a[jectDataTypes.DATA_TYPE_LONG_FIELD.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            a[jectDataTypes.DATA_TYPE_INT_FIELD.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[jectDataTypes.DATA_TYPE_SHORT_FIELD.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[jectDataTypes.DATA_TYPE_CHAR_FIELD.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[jectDataTypes.DATA_TYPE_BYTE_FIELD.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[jectDataTypes.DATA_TYPE_BOOLEAN_FIELD.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[jectDataTypes.DATA_TYPE_DOUBLE_FIELD.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[jectDataTypes.DATA_TYPE_FLOAT_FIELD.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[jectDataTypes.DATA_TYPE_APP_CREATED.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
