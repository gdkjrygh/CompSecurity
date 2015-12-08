// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

final class m
    implements Comparator
{

    final Collator a;
    final SettingsActivity.GeneralPrefsFragment b;

    m(SettingsActivity.GeneralPrefsFragment generalprefsfragment, Collator collator)
    {
        b = generalprefsfragment;
        a = collator;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Locale)obj;
        obj1 = (Locale)obj1;
        return a.compare(((Locale) (obj)).getDisplayCountry(), ((Locale) (obj1)).getDisplayCountry());
    }
}
