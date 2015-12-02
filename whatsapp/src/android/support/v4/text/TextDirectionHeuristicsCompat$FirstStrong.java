// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;


// Referenced classes of package android.support.v4.text:
//            TextDirectionHeuristicsCompat

class nAlgorithm
    implements nAlgorithm
{

    public static final nAlgorithm INSTANCE = new <init>();

    public int checkRtl(CharSequence charsequence, int i, int j)
    {
        boolean flag = TextDirectionHeuristicsCompat.a;
        int k = 2;
        int l = i;
        int i1;
        do
        {
            i1 = k;
            if (l >= i + j)
            {
                break;
            }
            i1 = k;
            if (k != 2)
            {
                break;
            }
            i1 = TextDirectionHeuristicsCompat.access$100(Character.getDirectionality(charsequence.charAt(l)));
            l++;
            k = i1;
        } while (!flag);
        return i1;
    }


    private nAlgorithm()
    {
    }
}
