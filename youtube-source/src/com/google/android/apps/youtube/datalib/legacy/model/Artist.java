// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.common.fromguava.c;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public final class Artist
    implements Serializable
{

    public final List artistTape;
    public final String bio;
    private volatile int hashCode;
    public final String id;
    public final String name;
    public final List relatedArtists;

    public Artist(String s, String s1, String s2, List list, List list1)
    {
        id = c.a(s, "id may not be null or empty");
        name = c.a(s1, "name may not be null or empty");
        artistTape = Collections.unmodifiableList((List)c.a(list));
        relatedArtists = Collections.unmodifiableList((List)c.a(list1));
        if (s2 != null)
        {
            bio = s2;
            return;
        } else
        {
            bio = "";
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Artist))
            {
                return false;
            }
            obj = (Artist)obj;
            if (!id.equals(((Artist) (obj)).id) || !name.equals(((Artist) (obj)).name) || !bio.equals(((Artist) (obj)).bio) || !artistTape.equals(((Artist) (obj)).artistTape) || !relatedArtists.equals(((Artist) (obj)).relatedArtists))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            i = ((((id.hashCode() + 527) * 31 + name.hashCode()) * 31 + bio.hashCode()) * 31 + artistTape.hashCode()) * 31 + relatedArtists.hashCode();
            hashCode = i;
        }
        return i;
    }

    public final String toString()
    {
        return (new StringBuilder("Artist{")).append(Integer.toHexString(System.identityHashCode(this))).append(" id=").append(id).append(" name=").append(name).append(" bio=").append(bio).append(" artistTape=").append(artistTape).append(" relatedArtists=").append(relatedArtists).append("}").toString();
    }
}
