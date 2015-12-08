// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            TreeMultiset

private static abstract class <init> extends Enum
{

    private static final DISTINCT $VALUES[];
    public static final DISTINCT DISTINCT;
    public static final DISTINCT SIZE;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/collect/TreeMultiset$Aggregate, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    abstract int nodeAggregate(e_3B_.clone clone);

    abstract long treeAggregate(e_3B_.clone clone);

    static 
    {
        SIZE = new TreeMultiset.Aggregate("SIZE", 0) {

            int nodeAggregate(TreeMultiset.AvlNode avlnode)
            {
                return TreeMultiset.AvlNode.access$200(avlnode);
            }

            long treeAggregate(TreeMultiset.AvlNode avlnode)
            {
                if (avlnode == null)
                {
                    return 0L;
                } else
                {
                    return TreeMultiset.AvlNode.access$300(avlnode);
                }
            }

        };
        DISTINCT = new TreeMultiset.Aggregate("DISTINCT", 1) {

            int nodeAggregate(TreeMultiset.AvlNode avlnode)
            {
                return 1;
            }

            long treeAggregate(TreeMultiset.AvlNode avlnode)
            {
                if (avlnode == null)
                {
                    return 0L;
                } else
                {
                    return (long)TreeMultiset.AvlNode.access$400(avlnode);
                }
            }

        };
        $VALUES = (new .VALUES[] {
            SIZE, DISTINCT
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, _cls2 _pcls2)
    {
        this(s, i);
    }
}
