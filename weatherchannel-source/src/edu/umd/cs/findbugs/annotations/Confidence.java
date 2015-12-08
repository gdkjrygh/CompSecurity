// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package edu.umd.cs.findbugs.annotations;


public final class Confidence extends Enum
{

    private static final Confidence $VALUES[];
    public static final Confidence HIGH;
    public static final Confidence IGNORE;
    public static final Confidence LOW;
    public static final Confidence MEDIUM;
    private final int confidenceValue;

    private Confidence(String s, int i, int j)
    {
        super(s, i);
        confidenceValue = j;
    }

    public static Confidence getConfidence(int i)
    {
        Confidence aconfidence[] = values();
        int k = aconfidence.length;
        for (int j = 0; j < k; j++)
        {
            Confidence confidence = aconfidence[j];
            if (i <= confidence.confidenceValue)
            {
                return confidence;
            }
        }

        return IGNORE;
    }

    public static Confidence valueOf(String s)
    {
        return (Confidence)Enum.valueOf(edu/umd/cs/findbugs/annotations/Confidence, s);
    }

    public static Confidence[] values()
    {
        return (Confidence[])$VALUES.clone();
    }

    public int getConfidenceValue()
    {
        return confidenceValue;
    }

    static 
    {
        HIGH = new Confidence("HIGH", 0, 1);
        MEDIUM = new Confidence("MEDIUM", 1, 2);
        LOW = new Confidence("LOW", 2, 3);
        IGNORE = new Confidence("IGNORE", 3, 5);
        $VALUES = (new Confidence[] {
            HIGH, MEDIUM, LOW, IGNORE
        });
    }
}
