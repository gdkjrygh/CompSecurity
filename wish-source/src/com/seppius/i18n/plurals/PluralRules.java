// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.seppius.i18n.plurals;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.seppius.i18n.plurals:
//            PluralRules_One, PluralRules_Czech, PluralRules_French, PluralRules_Balkan, 
//            PluralRules_Latvian, PluralRules_Lithuanian, PluralRules_Polish, PluralRules_Romanian, 
//            PluralRules_Slovenian, PluralRules_Arabic, PluralRules_Macedonian, PluralRules_Welsh, 
//            PluralRules_Breton, PluralRules_Langi, PluralRules_Tachelhit, PluralRules_Maltese, 
//            PluralRules_Two, PluralRules_Zero, PluralRules_None

public abstract class PluralRules
{

    static final int ID_OTHER = 0x1000004;
    static final int ID_ZERO = 0x1000005;
    static final int QUANTITY_FEW = 8;
    static final int QUANTITY_MANY = 16;
    static final int QUANTITY_ONE = 2;
    static final int QUANTITY_OTHER = 0;
    static final int QUANTITY_TWO = 4;
    static final int QUANTITY_ZERO = 1;
    private static Map allRules = new HashMap();

    public PluralRules()
    {
    }

    public static void addRules(String s, PluralRules pluralrules)
    {
        allRules.put(s, pluralrules);
    }

    public static void addRules(String as[], PluralRules pluralrules)
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            allRules.put(s, pluralrules);
        }

    }

    static final int attrForQuantity(int i)
    {
        switch (i)
        {
        default:
            return 0x1000004;

        case 1: // '\001'
            return 0x1000005;

        case 2: // '\002'
            return 0x1000006;

        case 4: // '\004'
            return 0x1000007;

        case 8: // '\b'
            return 0x1000008;

        case 16: // '\020'
            return 0x1000009;
        }
    }

    static final PluralRules ruleForLocale(Locale locale)
    {
        return (PluralRules)allRules.get(locale.getLanguage());
    }

    static final String stringForQuantity(int i)
    {
        switch (i)
        {
        default:
            return "other";

        case 1: // '\001'
            return "zero";

        case 2: // '\002'
            return "one";

        case 4: // '\004'
            return "two";

        case 8: // '\b'
            return "few";

        case 16: // '\020'
            return "many";
        }
    }

    final int attrForNumber(int i)
    {
        return attrForQuantity(quantityForNumber(i));
    }

    abstract int quantityForNumber(int i);

    static 
    {
        Object obj = new PluralRules_One();
        addRules(new String[] {
            "bem", "brx", "da", "de", "el", "en", "eo", "es", "et", "fi", 
            "fo", "gl", "he", "iw", "it", "nb", "nl", "nn", "no", "sv", 
            "af", "bg", "bn", "ca", "eu", "fur", "fy", "gu", "ha", "is", 
            "ku", "lb", "ml", "mr", "nah", "ne", "om", "or", "pa", "pap", 
            "ps", "so", "sq", "sw", "ta", "te", "tk", "ur", "zu", "mn", 
            "gsw", "chr", "rm", "pt"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Czech();
        addRules(new String[] {
            "cs", "sk"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_French();
        addRules(new String[] {
            "ff", "fr", "kab"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Balkan();
        addRules(new String[] {
            "hr", "ru", "sr", "uk", "be", "bs", "sh"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Latvian();
        addRules(new String[] {
            "lv"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Lithuanian();
        addRules(new String[] {
            "lt"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Polish();
        addRules(new String[] {
            "pl"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Romanian();
        addRules(new String[] {
            "ro", "mo"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Slovenian();
        addRules(new String[] {
            "sl"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Arabic();
        addRules(new String[] {
            "ar"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Macedonian();
        addRules(new String[] {
            "mk"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Welsh();
        addRules(new String[] {
            "cy"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Breton();
        addRules(new String[] {
            "br"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Langi();
        addRules(new String[] {
            "lag"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Tachelhit();
        addRules(new String[] {
            "shi"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Maltese();
        addRules(new String[] {
            "mt"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Two();
        addRules(new String[] {
            "ga", "se", "sma", "smi", "smj", "smn", "sms"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_Zero();
        addRules(new String[] {
            "ak", "am", "bh", "fil", "tl", "guw", "hi", "ln", "mg", "nso", 
            "ti", "wa"
        }, ((PluralRules) (obj)));
        obj = new PluralRules_None();
        addRules(new String[] {
            "az", "bm", "fa", "ig", "hu", "ja", "kde", "kea", "ko", "my", 
            "ses", "sg", "to", "tr", "vi", "wo", "yo", "zh", "bo", "dz", 
            "id", "jv", "ka", "km", "kn", "ms", "th"
        }, ((PluralRules) (obj)));
    }
}
