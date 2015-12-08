// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static abstract class <init> extends Enum
{

    private static final WEAK_EXPIRABLE_EVICTABLE $VALUES[];
    static final int EVICTABLE_MASK = 2;
    static final int EXPIRABLE_MASK = 1;
    public static final WEAK_EXPIRABLE_EVICTABLE STRONG;
    public static final WEAK_EXPIRABLE_EVICTABLE STRONG_EVICTABLE;
    public static final WEAK_EXPIRABLE_EVICTABLE STRONG_EXPIRABLE;
    public static final WEAK_EXPIRABLE_EVICTABLE STRONG_EXPIRABLE_EVICTABLE;
    public static final WEAK_EXPIRABLE_EVICTABLE WEAK;
    public static final WEAK_EXPIRABLE_EVICTABLE WEAK_EVICTABLE;
    public static final WEAK_EXPIRABLE_EVICTABLE WEAK_EXPIRABLE;
    public static final WEAK_EXPIRABLE_EVICTABLE WEAK_EXPIRABLE_EVICTABLE;
    static final WEAK_EXPIRABLE_EVICTABLE factories[][];

    static <init> getFactory(<init> <init>1, boolean flag, boolean flag1)
    {
        byte byte0 = 0;
        boolean flag2;
        if (flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag1)
        {
            byte0 = 2;
        }
        return factories[<init>1.nal()][flag2 | byte0];
    }

    public static nal valueOf(String s)
    {
        return (nal)Enum.valueOf(com/google/common/collect/MapMakerInternalMap$EntryFactory, s);
    }

    public static nal[] values()
    {
        return (nal[])$VALUES.clone();
    }

    y copyEntry(y y, y y1, y y2)
    {
        return newEntry(y, y1.getKey(), y1.getHash(), y2);
    }

    void copyEvictableEntry(y y, y y1)
    {
        MapMakerInternalMap.connectEvictables(y.getPreviousEvictable(), y1);
        MapMakerInternalMap.connectEvictables(y1, y.getNextEvictable());
        MapMakerInternalMap.nullifyEvictable(y);
    }

    void copyExpirableEntry(y y, y y1)
    {
        y1.setExpirationTime(y.getExpirationTime());
        MapMakerInternalMap.connectExpirables(y.getPreviousExpirable(), y1);
        MapMakerInternalMap.connectExpirables(y1, y.getNextExpirable());
        MapMakerInternalMap.nullifyExpirable(y);
    }

    abstract y newEntry(y y, Object obj, int i, y y1);

    static 
    {
        STRONG = new MapMakerInternalMap.EntryFactory("STRONG", 0) {

            MapMakerInternalMap.ReferenceEntry newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, MapMakerInternalMap.ReferenceEntry referenceentry)
            {
                return new MapMakerInternalMap.StrongEntry(obj, i, referenceentry);
            }

        };
        STRONG_EXPIRABLE = new MapMakerInternalMap.EntryFactory("STRONG_EXPIRABLE", 1) {

            MapMakerInternalMap.ReferenceEntry copyEntry(MapMakerInternalMap.Segment segment, MapMakerInternalMap.ReferenceEntry referenceentry, MapMakerInternalMap.ReferenceEntry referenceentry1)
            {
                segment = copyEntry(segment, referenceentry, referenceentry1);
                copyExpirableEntry(referenceentry, segment);
                return segment;
            }

            MapMakerInternalMap.ReferenceEntry newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, MapMakerInternalMap.ReferenceEntry referenceentry)
            {
                return new MapMakerInternalMap.StrongExpirableEntry(obj, i, referenceentry);
            }

        };
        STRONG_EVICTABLE = new MapMakerInternalMap.EntryFactory("STRONG_EVICTABLE", 2) {

            MapMakerInternalMap.ReferenceEntry copyEntry(MapMakerInternalMap.Segment segment, MapMakerInternalMap.ReferenceEntry referenceentry, MapMakerInternalMap.ReferenceEntry referenceentry1)
            {
                segment = copyEntry(segment, referenceentry, referenceentry1);
                copyEvictableEntry(referenceentry, segment);
                return segment;
            }

            MapMakerInternalMap.ReferenceEntry newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, MapMakerInternalMap.ReferenceEntry referenceentry)
            {
                return new MapMakerInternalMap.StrongEvictableEntry(obj, i, referenceentry);
            }

        };
        STRONG_EXPIRABLE_EVICTABLE = new MapMakerInternalMap.EntryFactory("STRONG_EXPIRABLE_EVICTABLE", 3) {

            MapMakerInternalMap.ReferenceEntry copyEntry(MapMakerInternalMap.Segment segment, MapMakerInternalMap.ReferenceEntry referenceentry, MapMakerInternalMap.ReferenceEntry referenceentry1)
            {
                segment = copyEntry(segment, referenceentry, referenceentry1);
                copyExpirableEntry(referenceentry, segment);
                copyEvictableEntry(referenceentry, segment);
                return segment;
            }

            MapMakerInternalMap.ReferenceEntry newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, MapMakerInternalMap.ReferenceEntry referenceentry)
            {
                return new MapMakerInternalMap.StrongExpirableEvictableEntry(obj, i, referenceentry);
            }

        };
        WEAK = new MapMakerInternalMap.EntryFactory("WEAK", 4) {

            MapMakerInternalMap.ReferenceEntry newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, MapMakerInternalMap.ReferenceEntry referenceentry)
            {
                return new MapMakerInternalMap.WeakEntry(segment.keyReferenceQueue, obj, i, referenceentry);
            }

        };
        WEAK_EXPIRABLE = new MapMakerInternalMap.EntryFactory("WEAK_EXPIRABLE", 5) {

            MapMakerInternalMap.ReferenceEntry copyEntry(MapMakerInternalMap.Segment segment, MapMakerInternalMap.ReferenceEntry referenceentry, MapMakerInternalMap.ReferenceEntry referenceentry1)
            {
                segment = copyEntry(segment, referenceentry, referenceentry1);
                copyExpirableEntry(referenceentry, segment);
                return segment;
            }

            MapMakerInternalMap.ReferenceEntry newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, MapMakerInternalMap.ReferenceEntry referenceentry)
            {
                return new MapMakerInternalMap.WeakExpirableEntry(segment.keyReferenceQueue, obj, i, referenceentry);
            }

        };
        WEAK_EVICTABLE = new MapMakerInternalMap.EntryFactory("WEAK_EVICTABLE", 6) {

            MapMakerInternalMap.ReferenceEntry copyEntry(MapMakerInternalMap.Segment segment, MapMakerInternalMap.ReferenceEntry referenceentry, MapMakerInternalMap.ReferenceEntry referenceentry1)
            {
                segment = copyEntry(segment, referenceentry, referenceentry1);
                copyEvictableEntry(referenceentry, segment);
                return segment;
            }

            MapMakerInternalMap.ReferenceEntry newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, MapMakerInternalMap.ReferenceEntry referenceentry)
            {
                return new MapMakerInternalMap.WeakEvictableEntry(segment.keyReferenceQueue, obj, i, referenceentry);
            }

        };
        WEAK_EXPIRABLE_EVICTABLE = new MapMakerInternalMap.EntryFactory("WEAK_EXPIRABLE_EVICTABLE", 7) {

            MapMakerInternalMap.ReferenceEntry copyEntry(MapMakerInternalMap.Segment segment, MapMakerInternalMap.ReferenceEntry referenceentry, MapMakerInternalMap.ReferenceEntry referenceentry1)
            {
                segment = copyEntry(segment, referenceentry, referenceentry1);
                copyExpirableEntry(referenceentry, segment);
                copyEvictableEntry(referenceentry, segment);
                return segment;
            }

            MapMakerInternalMap.ReferenceEntry newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, MapMakerInternalMap.ReferenceEntry referenceentry)
            {
                return new MapMakerInternalMap.WeakExpirableEvictableEntry(segment.keyReferenceQueue, obj, i, referenceentry);
            }

        };
        $VALUES = (new .VALUES[] {
            STRONG, STRONG_EXPIRABLE, STRONG_EVICTABLE, STRONG_EXPIRABLE_EVICTABLE, WEAK, WEAK_EXPIRABLE, WEAK_EVICTABLE, WEAK_EXPIRABLE_EVICTABLE
        });
        factories = (new factories[][] {
            new factories[] {
                STRONG, STRONG_EXPIRABLE, STRONG_EVICTABLE, STRONG_EXPIRABLE_EVICTABLE
            }, new STRONG_EXPIRABLE_EVICTABLE[0], new STRONG_EXPIRABLE_EVICTABLE[] {
                WEAK, WEAK_EXPIRABLE, WEAK_EVICTABLE, WEAK_EXPIRABLE_EVICTABLE
            }
        });
    }

    private _cls8(String s, int i)
    {
        super(s, i);
    }

    _cls8(String s, int i, _cls8 _pcls8)
    {
        this(s, i);
    }
}
