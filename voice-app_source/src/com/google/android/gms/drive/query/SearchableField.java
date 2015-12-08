// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzlq;

public class SearchableField
{

    public static final SearchableMetadataField IS_PINNED;
    public static final SearchableOrderedMetadataField LAST_VIEWED_BY_ME;
    public static final SearchableMetadataField MIME_TYPE;
    public static final SearchableOrderedMetadataField MODIFIED_DATE;
    public static final SearchableCollectionMetadataField PARENTS;
    public static final SearchableMetadataField STARRED;
    public static final SearchableMetadataField TITLE;
    public static final SearchableMetadataField TRASHED;
    public static final SearchableOrderedMetadataField zzahM;
    public static final SearchableMetadataField zzahN;

    public SearchableField()
    {
    }

    static 
    {
        TITLE = zzlo.zzahp;
        MIME_TYPE = zzlo.zzahg;
        TRASHED = zzlo.zzahq;
        PARENTS = zzlo.zzahl;
        zzahM = zzlq.zzahC;
        STARRED = zzlo.zzahn;
        MODIFIED_DATE = zzlq.zzahA;
        LAST_VIEWED_BY_ME = zzlq.zzahz;
        IS_PINNED = zzlo.zzagY;
        zzahN = zzlo.zzagM;
    }
}
