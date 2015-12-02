// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;

interface cp
{

    public abstract int a(Uri uri, ContentValues contentvalues, String s, String as[]);

    public abstract int a(Uri uri, String s, String as[]);

    public abstract Cursor a(Uri uri, String as[], String s, String as1[], String s1);

    public abstract Uri a(Uri uri, ContentValues contentvalues);

    public abstract ContentProviderResult[] a(ArrayList arraylist);
}
