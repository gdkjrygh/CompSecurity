// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;


// Referenced classes of package com.google.common.cache:
//            LocalCache

static abstract class <init> extends Enum
{

    private static final WEAK_ACCESS_WRITE $VALUES[];
    static final int ACCESS_MASK = 1;
    public static final WEAK_ACCESS_WRITE STRONG;
    public static final WEAK_ACCESS_WRITE STRONG_ACCESS;
    public static final WEAK_ACCESS_WRITE STRONG_ACCESS_WRITE;
    public static final WEAK_ACCESS_WRITE STRONG_WRITE;
    public static final WEAK_ACCESS_WRITE WEAK;
    public static final WEAK_ACCESS_WRITE WEAK_ACCESS;
    public static final WEAK_ACCESS_WRITE WEAK_ACCESS_WRITE;
    static final int WEAK_MASK = 4;
    public static final WEAK_ACCESS_WRITE WEAK_WRITE;
    static final int WRITE_MASK = 2;
    static final WEAK_ACCESS_WRITE factories[];

    static <init> getFactory(<init> <init>1, boolean flag, boolean flag1)
    {
        byte byte1 = 0;
        byte byte0;
        boolean flag2;
        if (<init>1 == )
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        if (flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag1)
        {
            byte1 = 2;
        }
        return factories[flag2 | byte0 | byte1];
    }

    public static factories valueOf(String s)
    {
        return (factories)Enum.valueOf(com/google/common/cache/LocalCache$EntryFactory, s);
    }

    public static factories[] values()
    {
        return (factories[])$VALUES.clone();
    }

    void copyAccessEntry(y y, y y1)
    {
        y1.setAccessTime(y.getAccessTime());
        LocalCache.connectAccessOrder(y.getPreviousInAccessQueue(), y1);
        LocalCache.connectAccessOrder(y1, y.getNextInAccessQueue());
        LocalCache.nullifyAccessOrder(y);
    }

    y copyEntry(y y, y y1, y y2)
    {
        return newEntry(y, y1.getKey(), y1.getHash(), y2);
    }

    void copyWriteEntry(y y, y y1)
    {
        y1.setWriteTime(y.getWriteTime());
        LocalCache.connectWriteOrder(y.getPreviousInWriteQueue(), y1);
        LocalCache.connectWriteOrder(y1, y.getNextInWriteQueue());
        LocalCache.nullifyWriteOrder(y);
    }

    abstract y newEntry(y y, Object obj, int i, y y1);

    static 
    {
        STRONG = new LocalCache.EntryFactory("STRONG", 0) {

            LocalCache.ReferenceEntry newEntry(LocalCache.Segment segment, Object obj, int i, LocalCache.ReferenceEntry referenceentry)
            {
                return new LocalCache.StrongEntry(obj, i, referenceentry);
            }

        };
        STRONG_ACCESS = new LocalCache.EntryFactory("STRONG_ACCESS", 1) {

            LocalCache.ReferenceEntry copyEntry(LocalCache.Segment segment, LocalCache.ReferenceEntry referenceentry, LocalCache.ReferenceEntry referenceentry1)
            {
                segment = copyEntry(segment, referenceentry, referenceentry1);
                copyAccessEntry(referenceentry, segment);
                return segment;
            }

            LocalCache.ReferenceEntry newEntry(LocalCache.Segment segment, Object obj, int i, LocalCache.ReferenceEntry referenceentry)
            {
                return new LocalCache.StrongAccessEntry(obj, i, referenceentry);
            }

        };
        STRONG_WRITE = new LocalCache.EntryFactory("STRONG_WRITE", 2) {

            LocalCache.ReferenceEntry copyEntry(LocalCache.Segment segment, LocalCache.ReferenceEntry referenceentry, LocalCache.ReferenceEntry referenceentry1)
            {
                segment = copyEntry(segment, referenceentry, referenceentry1);
                copyWriteEntry(referenceentry, segment);
                return segment;
            }

            LocalCache.ReferenceEntry newEntry(LocalCache.Segment segment, Object obj, int i, LocalCache.ReferenceEntry referenceentry)
            {
                return new LocalCache.StrongWriteEntry(obj, i, referenceentry);
            }

        };
        STRONG_ACCESS_WRITE = new LocalCache.EntryFactory("STRONG_ACCESS_WRITE", 3) {

            LocalCache.ReferenceEntry copyEntry(LocalCache.Segment segment, LocalCache.ReferenceEntry referenceentry, LocalCache.ReferenceEntry referenceentry1)
            {
                segment = copyEntry(segment, referenceentry, referenceentry1);
                copyAccessEntry(referenceentry, segment);
                copyWriteEntry(referenceentry, segment);
                return segment;
            }

            LocalCache.ReferenceEntry newEntry(LocalCache.Segment segment, Object obj, int i, LocalCache.ReferenceEntry referenceentry)
            {
                return new LocalCache.StrongAccessWriteEntry(obj, i, referenceentry);
            }

        };
        WEAK = new LocalCache.EntryFactory("WEAK", 4) {

            LocalCache.ReferenceEntry newEntry(LocalCache.Segment segment, Object obj, int i, LocalCache.ReferenceEntry referenceentry)
            {
                return new LocalCache.WeakEntry(segment.keyReferenceQueue, obj, i, referenceentry);
            }

        };
        WEAK_ACCESS = new LocalCache.EntryFactory("WEAK_ACCESS", 5) {

            LocalCache.ReferenceEntry copyEntry(LocalCache.Segment segment, LocalCache.ReferenceEntry referenceentry, LocalCache.ReferenceEntry referenceentry1)
            {
                segment = copyEntry(segment, referenceentry, referenceentry1);
                copyAccessEntry(referenceentry, segment);
                return segment;
            }

            LocalCache.ReferenceEntry newEntry(LocalCache.Segment segment, Object obj, int i, LocalCache.ReferenceEntry referenceentry)
            {
                return new LocalCache.WeakAccessEntry(segment.keyReferenceQueue, obj, i, referenceentry);
            }

        };
        WEAK_WRITE = new LocalCache.EntryFactory("WEAK_WRITE", 6) {

            LocalCache.ReferenceEntry copyEntry(LocalCache.Segment segment, LocalCache.ReferenceEntry referenceentry, LocalCache.ReferenceEntry referenceentry1)
            {
                segment = copyEntry(segment, referenceentry, referenceentry1);
                copyWriteEntry(referenceentry, segment);
                return segment;
            }

            LocalCache.ReferenceEntry newEntry(LocalCache.Segment segment, Object obj, int i, LocalCache.ReferenceEntry referenceentry)
            {
                return new LocalCache.WeakWriteEntry(segment.keyReferenceQueue, obj, i, referenceentry);
            }

        };
        WEAK_ACCESS_WRITE = new LocalCache.EntryFactory("WEAK_ACCESS_WRITE", 7) {

            LocalCache.ReferenceEntry copyEntry(LocalCache.Segment segment, LocalCache.ReferenceEntry referenceentry, LocalCache.ReferenceEntry referenceentry1)
            {
                segment = copyEntry(segment, referenceentry, referenceentry1);
                copyAccessEntry(referenceentry, segment);
                copyWriteEntry(referenceentry, segment);
                return segment;
            }

            LocalCache.ReferenceEntry newEntry(LocalCache.Segment segment, Object obj, int i, LocalCache.ReferenceEntry referenceentry)
            {
                return new LocalCache.WeakAccessWriteEntry(segment.keyReferenceQueue, obj, i, referenceentry);
            }

        };
        $VALUES = (new .VALUES[] {
            STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE
        });
        factories = (new factories[] {
            STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE
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
