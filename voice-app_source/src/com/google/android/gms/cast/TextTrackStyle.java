// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzlh;
import com.google.android.gms.internal.zzlk;
import org.json.JSONException;
import org.json.JSONObject;

public final class TextTrackStyle
{

    public static final int COLOR_UNSPECIFIED = 0;
    public static final float DEFAULT_FONT_SCALE = 1F;
    public static final int EDGE_TYPE_DEPRESSED = 4;
    public static final int EDGE_TYPE_DROP_SHADOW = 2;
    public static final int EDGE_TYPE_NONE = 0;
    public static final int EDGE_TYPE_OUTLINE = 1;
    public static final int EDGE_TYPE_RAISED = 3;
    public static final int EDGE_TYPE_UNSPECIFIED = -1;
    public static final int FONT_FAMILY_CASUAL = 4;
    public static final int FONT_FAMILY_CURSIVE = 5;
    public static final int FONT_FAMILY_MONOSPACED_SANS_SERIF = 1;
    public static final int FONT_FAMILY_MONOSPACED_SERIF = 3;
    public static final int FONT_FAMILY_SANS_SERIF = 0;
    public static final int FONT_FAMILY_SERIF = 2;
    public static final int FONT_FAMILY_SMALL_CAPITALS = 6;
    public static final int FONT_FAMILY_UNSPECIFIED = -1;
    public static final int FONT_STYLE_BOLD = 1;
    public static final int FONT_STYLE_BOLD_ITALIC = 3;
    public static final int FONT_STYLE_ITALIC = 2;
    public static final int FONT_STYLE_NORMAL = 0;
    public static final int FONT_STYLE_UNSPECIFIED = -1;
    public static final int WINDOW_TYPE_NONE = 0;
    public static final int WINDOW_TYPE_NORMAL = 1;
    public static final int WINDOW_TYPE_ROUNDED = 2;
    public static final int WINDOW_TYPE_UNSPECIFIED = -1;
    private JSONObject zzRJ;
    private float zzTc;
    private int zzTd;
    private int zzTe;
    private int zzTf;
    private int zzTg;
    private int zzTh;
    private int zzTi;
    private String zzTj;
    private int zzTk;
    private int zzTl;
    private int zzvc;

    public TextTrackStyle()
    {
        clear();
    }

    private void clear()
    {
        zzTc = 1.0F;
        zzTd = 0;
        zzvc = 0;
        zzTe = -1;
        zzTf = 0;
        zzTg = -1;
        zzTh = 0;
        zzTi = 0;
        zzTj = null;
        zzTk = -1;
        zzTl = -1;
        zzRJ = null;
    }

    public static TextTrackStyle fromSystemSettings(Context context)
    {
        TextTrackStyle texttrackstyle;
        texttrackstyle = new TextTrackStyle();
        if (!zzlk.zzoX())
        {
            return texttrackstyle;
        }
        context = (CaptioningManager)context.getSystemService("captioning");
        texttrackstyle.setFontScale(context.getFontScale());
        context = context.getUserStyle();
        texttrackstyle.setBackgroundColor(((android.view.accessibility.CaptioningManager.CaptionStyle) (context)).backgroundColor);
        texttrackstyle.setForegroundColor(((android.view.accessibility.CaptioningManager.CaptionStyle) (context)).foregroundColor);
        ((android.view.accessibility.CaptioningManager.CaptionStyle) (context)).edgeType;
        JVM INSTR tableswitch 1 2: default 80
    //                   1 142
    //                   2 150;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_150;
_L1:
        texttrackstyle.setEdgeType(0);
_L4:
        texttrackstyle.setEdgeColor(((android.view.accessibility.CaptioningManager.CaptionStyle) (context)).edgeColor);
        context = context.getTypeface();
        if (context != null)
        {
            boolean flag;
            boolean flag1;
            if (Typeface.MONOSPACE.equals(context))
            {
                texttrackstyle.setFontGenericFamily(1);
            } else
            if (Typeface.SANS_SERIF.equals(context))
            {
                texttrackstyle.setFontGenericFamily(0);
            } else
            if (Typeface.SERIF.equals(context))
            {
                texttrackstyle.setFontGenericFamily(2);
            } else
            {
                texttrackstyle.setFontGenericFamily(0);
            }
            flag = context.isBold();
            flag1 = context.isItalic();
            if (flag && flag1)
            {
                texttrackstyle.setFontStyle(3);
            } else
            if (flag)
            {
                texttrackstyle.setFontStyle(1);
            } else
            if (flag1)
            {
                texttrackstyle.setFontStyle(2);
            } else
            {
                texttrackstyle.setFontStyle(0);
            }
        }
        return texttrackstyle;
_L2:
        texttrackstyle.setEdgeType(1);
          goto _L4
        texttrackstyle.setEdgeType(2);
          goto _L4
    }

    private String zzG(int i)
    {
        return String.format("#%02X%02X%02X%02X", new Object[] {
            Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i))
        });
    }

    private int zzbz(String s)
    {
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if (s != null)
        {
            i = ((flag) ? 1 : 0);
            if (s.length() == 9)
            {
                i = ((flag) ? 1 : 0);
                if (s.charAt(0) == '#')
                {
                    try
                    {
                        i = Integer.parseInt(s.substring(1, 3), 16);
                        int j = Integer.parseInt(s.substring(3, 5), 16);
                        int k = Integer.parseInt(s.substring(5, 7), 16);
                        i = Color.argb(Integer.parseInt(s.substring(7, 9), 16), i, j, k);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public boolean equals(Object obj)
    {
        boolean flag4;
        boolean flag5;
        flag4 = true;
        flag5 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag2 = true;
_L4:
        return flag2;
_L2:
        flag2 = flag5;
        if (!(obj instanceof TextTrackStyle)) goto _L4; else goto _L3
_L3:
        obj = (TextTrackStyle)obj;
        boolean flag;
        boolean flag1;
        if (zzRJ == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((TextTrackStyle) (obj)).zzRJ == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag5;
        if (flag != flag1) goto _L4; else goto _L5
_L5:
        if (zzRJ == null || ((TextTrackStyle) (obj)).zzRJ == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag5;
        if (!zzlh.zzd(zzRJ, ((TextTrackStyle) (obj)).zzRJ)) goto _L4; else goto _L6
_L6:
        boolean flag3;
        if (zzTc == ((TextTrackStyle) (obj)).zzTc && zzTd == ((TextTrackStyle) (obj)).zzTd && zzvc == ((TextTrackStyle) (obj)).zzvc && zzTe == ((TextTrackStyle) (obj)).zzTe && zzTf == ((TextTrackStyle) (obj)).zzTf && zzTg == ((TextTrackStyle) (obj)).zzTg && zzTi == ((TextTrackStyle) (obj)).zzTi && com.google.android.gms.cast.internal.zzf.zza(zzTj, ((TextTrackStyle) (obj)).zzTj) && zzTk == ((TextTrackStyle) (obj)).zzTk && zzTl == ((TextTrackStyle) (obj)).zzTl)
        {
            flag3 = flag4;
        } else
        {
            flag3 = false;
        }
        return flag3;
    }

    public int getBackgroundColor()
    {
        return zzvc;
    }

    public JSONObject getCustomData()
    {
        return zzRJ;
    }

    public int getEdgeColor()
    {
        return zzTf;
    }

    public int getEdgeType()
    {
        return zzTe;
    }

    public String getFontFamily()
    {
        return zzTj;
    }

    public int getFontGenericFamily()
    {
        return zzTk;
    }

    public float getFontScale()
    {
        return zzTc;
    }

    public int getFontStyle()
    {
        return zzTl;
    }

    public int getForegroundColor()
    {
        return zzTd;
    }

    public int getWindowColor()
    {
        return zzTh;
    }

    public int getWindowCornerRadius()
    {
        return zzTi;
    }

    public int getWindowType()
    {
        return zzTg;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Float.valueOf(zzTc), Integer.valueOf(zzTd), Integer.valueOf(zzvc), Integer.valueOf(zzTe), Integer.valueOf(zzTf), Integer.valueOf(zzTg), Integer.valueOf(zzTh), Integer.valueOf(zzTi), zzTj, Integer.valueOf(zzTk), 
            Integer.valueOf(zzTl), zzRJ
        });
    }

    public void setBackgroundColor(int i)
    {
        zzvc = i;
    }

    public void setCustomData(JSONObject jsonobject)
    {
        zzRJ = jsonobject;
    }

    public void setEdgeColor(int i)
    {
        zzTf = i;
    }

    public void setEdgeType(int i)
    {
        if (i < 0 || i > 4)
        {
            throw new IllegalArgumentException("invalid edgeType");
        } else
        {
            zzTe = i;
            return;
        }
    }

    public void setFontFamily(String s)
    {
        zzTj = s;
    }

    public void setFontGenericFamily(int i)
    {
        if (i < 0 || i > 6)
        {
            throw new IllegalArgumentException("invalid fontGenericFamily");
        } else
        {
            zzTk = i;
            return;
        }
    }

    public void setFontScale(float f)
    {
        zzTc = f;
    }

    public void setFontStyle(int i)
    {
        if (i < 0 || i > 3)
        {
            throw new IllegalArgumentException("invalid fontStyle");
        } else
        {
            zzTl = i;
            return;
        }
    }

    public void setForegroundColor(int i)
    {
        zzTd = i;
    }

    public void setWindowColor(int i)
    {
        zzTh = i;
    }

    public void setWindowCornerRadius(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("invalid windowCornerRadius");
        } else
        {
            zzTi = i;
            return;
        }
    }

    public void setWindowType(int i)
    {
        if (i < 0 || i > 2)
        {
            throw new IllegalArgumentException("invalid windowType");
        } else
        {
            zzTg = i;
            return;
        }
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("fontScale", zzTc);
        if (zzTd != 0)
        {
            jsonobject.put("foregroundColor", zzG(zzTd));
        }
        if (zzvc != 0)
        {
            jsonobject.put("backgroundColor", zzG(zzvc));
        }
        zzTe;
        JVM INSTR tableswitch 0 4: default 587
    //                   0 321
    //                   1 335
    //                   2 349
    //                   3 363
    //                   4 377;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (zzTf != 0)
        {
            jsonobject.put("edgeColor", zzG(zzTf));
        }
        zzTg;
        JVM INSTR tableswitch 0 2: default 590
    //                   0 391
    //                   1 405
    //                   2 419;
           goto _L7 _L8 _L9 _L10
_L7:
        if (zzTh != 0)
        {
            jsonobject.put("windowColor", zzG(zzTh));
        }
        if (zzTg == 2)
        {
            jsonobject.put("windowRoundedCornerRadius", zzTi);
        }
        if (zzTj != null)
        {
            jsonobject.put("fontFamily", zzTj);
        }
        zzTk;
        JVM INSTR tableswitch 0 6: default 593
    //                   0 433
    //                   1 447
    //                   2 461
    //                   3 475
    //                   4 489
    //                   5 503
    //                   6 517;
           goto _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L11:
        zzTl;
        JVM INSTR tableswitch 0 3: default 596
    //                   0 531
    //                   1 545
    //                   2 559
    //                   3 573;
           goto _L19 _L20 _L21 _L22 _L23
_L19:
        if (zzRJ == null) goto _L25; else goto _L24
_L24:
        jsonobject.put("customData", zzRJ);
        return jsonobject;
_L2:
        try
        {
            jsonobject.put("edgeType", "NONE");
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        jsonobject.put("edgeType", "OUTLINE");
        continue; /* Loop/switch isn't completed */
_L4:
        jsonobject.put("edgeType", "DROP_SHADOW");
        continue; /* Loop/switch isn't completed */
_L5:
        jsonobject.put("edgeType", "RAISED");
        continue; /* Loop/switch isn't completed */
_L6:
        jsonobject.put("edgeType", "DEPRESSED");
        continue; /* Loop/switch isn't completed */
_L8:
        jsonobject.put("windowType", "NONE");
          goto _L7
_L9:
        jsonobject.put("windowType", "NORMAL");
          goto _L7
_L10:
        jsonobject.put("windowType", "ROUNDED_CORNERS");
          goto _L7
_L12:
        jsonobject.put("fontGenericFamily", "SANS_SERIF");
          goto _L11
_L13:
        jsonobject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
          goto _L11
_L14:
        jsonobject.put("fontGenericFamily", "SERIF");
          goto _L11
_L15:
        jsonobject.put("fontGenericFamily", "MONOSPACED_SERIF");
          goto _L11
_L16:
        jsonobject.put("fontGenericFamily", "CASUAL");
          goto _L11
_L17:
        jsonobject.put("fontGenericFamily", "CURSIVE");
          goto _L11
_L18:
        jsonobject.put("fontGenericFamily", "SMALL_CAPITALS");
          goto _L11
_L20:
        jsonobject.put("fontStyle", "NORMAL");
          goto _L19
_L21:
        jsonobject.put("fontStyle", "BOLD");
          goto _L19
_L22:
        jsonobject.put("fontStyle", "ITALIC");
          goto _L19
_L23:
        jsonobject.put("fontStyle", "BOLD_ITALIC");
          goto _L19
_L25:
        return jsonobject;
        if (true) goto _L1; else goto _L26
_L26:
    }

    public void zzf(JSONObject jsonobject)
        throws JSONException
    {
        clear();
        zzTc = (float)jsonobject.optDouble("fontScale", 1.0D);
        zzTd = zzbz(jsonobject.optString("foregroundColor"));
        zzvc = zzbz(jsonobject.optString("backgroundColor"));
        String s;
        if (jsonobject.has("edgeType"))
        {
            s = jsonobject.getString("edgeType");
            if ("NONE".equals(s))
            {
                zzTe = 0;
            } else
            if ("OUTLINE".equals(s))
            {
                zzTe = 1;
            } else
            if ("DROP_SHADOW".equals(s))
            {
                zzTe = 2;
            } else
            if ("RAISED".equals(s))
            {
                zzTe = 3;
            } else
            if ("DEPRESSED".equals(s))
            {
                zzTe = 4;
            }
        }
        zzTf = zzbz(jsonobject.optString("edgeColor"));
        if (jsonobject.has("windowType"))
        {
            s = jsonobject.getString("windowType");
            if ("NONE".equals(s))
            {
                zzTg = 0;
            } else
            if ("NORMAL".equals(s))
            {
                zzTg = 1;
            } else
            if ("ROUNDED_CORNERS".equals(s))
            {
                zzTg = 2;
            }
        }
        zzTh = zzbz(jsonobject.optString("windowColor"));
        if (zzTg == 2)
        {
            zzTi = jsonobject.optInt("windowRoundedCornerRadius", 0);
        }
        zzTj = jsonobject.optString("fontFamily", null);
        if (jsonobject.has("fontGenericFamily"))
        {
            s = jsonobject.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(s))
            {
                zzTk = 0;
            } else
            if ("MONOSPACED_SANS_SERIF".equals(s))
            {
                zzTk = 1;
            } else
            if ("SERIF".equals(s))
            {
                zzTk = 2;
            } else
            if ("MONOSPACED_SERIF".equals(s))
            {
                zzTk = 3;
            } else
            if ("CASUAL".equals(s))
            {
                zzTk = 4;
            } else
            if ("CURSIVE".equals(s))
            {
                zzTk = 5;
            } else
            if ("SMALL_CAPITALS".equals(s))
            {
                zzTk = 6;
            }
        }
        if (jsonobject.has("fontStyle"))
        {
            s = jsonobject.getString("fontStyle");
            if ("NORMAL".equals(s))
            {
                zzTl = 0;
            } else
            if ("BOLD".equals(s))
            {
                zzTl = 1;
            } else
            if ("ITALIC".equals(s))
            {
                zzTl = 2;
            } else
            if ("BOLD_ITALIC".equals(s))
            {
                zzTl = 3;
            }
        }
        zzRJ = jsonobject.optJSONObject("customData");
    }
}
