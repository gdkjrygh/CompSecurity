// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson;


public class Version
    implements Comparable
{

    private static final Version UNKNOWN_VERSION = new Version(0, 0, 0, null);
    protected final int _majorVersion;
    protected final int _minorVersion;
    protected final int _patchLevel;
    protected final String _snapshotInfo;

    public Version(int i, int j, int k, String s)
    {
        _majorVersion = i;
        _minorVersion = j;
        _patchLevel = k;
        _snapshotInfo = s;
    }

    public static Version unknownVersion()
    {
        return UNKNOWN_VERSION;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Version)obj);
    }

    public int compareTo(Version version)
    {
        int j = _majorVersion - version._majorVersion;
        int i = j;
        if (j == 0)
        {
            int k = _minorVersion - version._minorVersion;
            i = k;
            if (k == 0)
            {
                i = _patchLevel - version._patchLevel;
            }
        }
        return i;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj.getClass() != getClass())
            {
                return false;
            }
            obj = (Version)obj;
            if (((Version) (obj))._majorVersion != _majorVersion || ((Version) (obj))._minorVersion != _minorVersion || ((Version) (obj))._patchLevel != _patchLevel)
            {
                return false;
            }
        }
        return true;
    }

    public int getMajorVersion()
    {
        return _majorVersion;
    }

    public int getMinorVersion()
    {
        return _minorVersion;
    }

    public int getPatchLevel()
    {
        return _patchLevel;
    }

    public int hashCode()
    {
        return _majorVersion + _minorVersion + _patchLevel;
    }

    public boolean isSnapshot()
    {
        return _snapshotInfo != null && _snapshotInfo.length() > 0;
    }

    public boolean isUknownVersion()
    {
        return this == UNKNOWN_VERSION;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(_majorVersion).append('.');
        stringbuilder.append(_minorVersion).append('.');
        stringbuilder.append(_patchLevel);
        if (isSnapshot())
        {
            stringbuilder.append('-').append(_snapshotInfo);
        }
        return stringbuilder.toString();
    }

}
