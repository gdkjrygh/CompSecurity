// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.LruCache;
import android.util.TypedValue;

// Referenced classes of package android.support.v7.internal.widget:
//            TintResources, TintDrawableWrapper

public class TintManager
{
    private static class ColorFilterLruCache extends LruCache
    {

        private static int generateCacheKey(int i, android.graphics.PorterDuff.Mode mode)
        {
            return (i + 31) * 31 + mode.hashCode();
        }

        PorterDuffColorFilter get(int i, android.graphics.PorterDuff.Mode mode)
        {
            return (PorterDuffColorFilter)get(Integer.valueOf(generateCacheKey(i, mode)));
        }

        PorterDuffColorFilter put(int i, android.graphics.PorterDuff.Mode mode, PorterDuffColorFilter porterduffcolorfilter)
        {
            return (PorterDuffColorFilter)put(Integer.valueOf(generateCacheKey(i, mode)), porterduffcolorfilter);
        }

        public ColorFilterLruCache(int i)
        {
            super(i);
        }
    }


    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
    private static final int CONTAINERS_WITH_TINT_CHILDREN[];
    private static final boolean DEBUG = false;
    static final android.graphics.PorterDuff.Mode DEFAULT_MODE;
    private static final String TAG = android/support/v7/internal/widget/TintManager.getSimpleName();
    private static final int TINT_COLOR_BACKGROUND_MULTIPLY[];
    private static final int TINT_COLOR_CONTROL_ACTIVATED[];
    private static final int TINT_COLOR_CONTROL_NORMAL[];
    private static final int TINT_COLOR_CONTROL_STATE_LIST[];
    private final Context mContext;
    private ColorStateList mDefaultColorStateList;
    private final Resources mResources;
    private ColorStateList mSwitchThumbStateList;
    private ColorStateList mSwitchTrackStateList;
    private final TypedValue mTypedValue = new TypedValue();

    public TintManager(Context context)
    {
        mContext = context;
        mResources = new TintResources(context.getResources(), this);
    }

    private static boolean arrayContains(int ai[], int i)
    {
        int k = ai.length;
        for (int j = 0; j < k; j++)
        {
            if (ai[j] == i)
            {
                return true;
            }
        }

        return false;
    }

    private ColorStateList getDefaultColorStateList()
    {
        if (mDefaultColorStateList == null)
        {
            int i = getThemeAttrColor(android.support.v7.appcompat.R.attr.colorControlNormal);
            int j = getThemeAttrColor(android.support.v7.appcompat.R.attr.colorControlActivated);
            int ai[][] = new int[7][];
            int ai1[] = new int[7];
            ai[0] = (new int[] {
                0xfefeff62
            });
            ai1[0] = getDisabledThemeAttrColor(android.support.v7.appcompat.R.attr.colorControlNormal);
            int k = 0 + 1;
            ai[k] = (new int[] {
                0x101009c
            });
            ai1[k] = j;
            k++;
            ai[k] = (new int[] {
                0x10102fe
            });
            ai1[k] = j;
            k++;
            ai[k] = (new int[] {
                0x10100a7
            });
            ai1[k] = j;
            k++;
            ai[k] = (new int[] {
                0x10100a0
            });
            ai1[k] = j;
            k++;
            ai[k] = (new int[] {
                0x10100a1
            });
            ai1[k] = j;
            j = k + 1;
            ai[j] = new int[0];
            ai1[j] = i;
            mDefaultColorStateList = new ColorStateList(ai, ai1);
        }
        return mDefaultColorStateList;
    }

    public static Drawable getDrawable(Context context, int i)
    {
        if (isInTintList(i))
        {
            return (new TintManager(context)).getDrawable(i);
        } else
        {
            return ContextCompat.getDrawable(context, i);
        }
    }

    private ColorStateList getSwitchThumbColorStateList()
    {
        if (mSwitchThumbStateList == null)
        {
            int ai[][] = new int[3][];
            int ai1[] = new int[3];
            ai[0] = (new int[] {
                0xfefeff62
            });
            ai1[0] = getDisabledThemeAttrColor(android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
            int i = 0 + 1;
            ai[i] = (new int[] {
                0x10100a0
            });
            ai1[i] = getThemeAttrColor(android.support.v7.appcompat.R.attr.colorControlActivated);
            i++;
            ai[i] = new int[0];
            ai1[i] = getThemeAttrColor(android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
            mSwitchThumbStateList = new ColorStateList(ai, ai1);
        }
        return mSwitchThumbStateList;
    }

    private ColorStateList getSwitchTrackColorStateList()
    {
        if (mSwitchTrackStateList == null)
        {
            int ai[][] = new int[3][];
            int ai1[] = new int[3];
            ai[0] = (new int[] {
                0xfefeff62
            });
            ai1[0] = getThemeAttrColor(0x1010030, 0.1F);
            int i = 0 + 1;
            ai[i] = (new int[] {
                0x10100a0
            });
            ai1[i] = getThemeAttrColor(android.support.v7.appcompat.R.attr.colorControlActivated, 0.3F);
            i++;
            ai[i] = new int[0];
            ai1[i] = getThemeAttrColor(0x1010030, 0.3F);
            mSwitchTrackStateList = new ColorStateList(ai, ai1);
        }
        return mSwitchTrackStateList;
    }

    private static boolean isInTintList(int i)
    {
        return arrayContains(TINT_COLOR_BACKGROUND_MULTIPLY, i) || arrayContains(TINT_COLOR_CONTROL_NORMAL, i) || arrayContains(TINT_COLOR_CONTROL_ACTIVATED, i) || arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i) || arrayContains(CONTAINERS_WITH_TINT_CHILDREN, i);
    }

    int getDisabledThemeAttrColor(int i)
    {
        mContext.getTheme().resolveAttribute(0x1010033, mTypedValue, true);
        return getThemeAttrColor(i, mTypedValue.getFloat());
    }

    public Drawable getDrawable(int i)
    {
        Drawable drawable;
label0:
        {
            drawable = ContextCompat.getDrawable(mContext, i);
            Object obj = drawable;
            if (drawable != null)
            {
                if (!arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i))
                {
                    break label0;
                }
                obj = new TintDrawableWrapper(drawable, getDefaultColorStateList());
            }
            return ((Drawable) (obj));
        }
        if (i == android.support.v7.appcompat.R.drawable.abc_switch_track_mtrl_alpha)
        {
            return new TintDrawableWrapper(drawable, getSwitchTrackColorStateList());
        }
        if (i == android.support.v7.appcompat.R.drawable.abc_switch_thumb_material)
        {
            return new TintDrawableWrapper(drawable, getSwitchThumbColorStateList(), android.graphics.PorterDuff.Mode.MULTIPLY);
        }
        if (arrayContains(CONTAINERS_WITH_TINT_CHILDREN, i))
        {
            return mResources.getDrawable(i);
        } else
        {
            tintDrawable(i, drawable);
            return drawable;
        }
    }

    int getThemeAttrColor(int i)
    {
        if (mContext.getTheme().resolveAttribute(i, mTypedValue, true))
        {
            if (mTypedValue.type >= 16 && mTypedValue.type <= 31)
            {
                return mTypedValue.data;
            }
            if (mTypedValue.type == 3)
            {
                return mResources.getColor(mTypedValue.resourceId);
            }
        }
        return 0;
    }

    int getThemeAttrColor(int i, float f)
    {
        i = getThemeAttrColor(i);
        return 0xffffff & i | Math.round((float)Color.alpha(i) * f) << 24;
    }

    void tintDrawable(int i, Drawable drawable)
    {
        android.graphics.PorterDuff.Mode mode;
        int j;
        boolean flag;
        int k;
        mode = null;
        flag = false;
        j = 0;
        k = -1;
        if (!arrayContains(TINT_COLOR_CONTROL_NORMAL, i)) goto _L2; else goto _L1
_L1:
        Object obj;
        j = android.support.v7.appcompat.R.attr.colorControlNormal;
        flag = true;
        obj = mode;
_L4:
        if (flag)
        {
            mode = ((android.graphics.PorterDuff.Mode) (obj));
            if (obj == null)
            {
                mode = DEFAULT_MODE;
            }
            i = getThemeAttrColor(j);
            PorterDuffColorFilter porterduffcolorfilter = COLOR_FILTER_CACHE.get(i, mode);
            obj = porterduffcolorfilter;
            if (porterduffcolorfilter == null)
            {
                obj = new PorterDuffColorFilter(i, mode);
                COLOR_FILTER_CACHE.put(i, mode, ((PorterDuffColorFilter) (obj)));
            }
            drawable.setColorFilter(((android.graphics.ColorFilter) (obj)));
            if (k != -1)
            {
                drawable.setAlpha(k);
            }
        }
        return;
_L2:
        if (arrayContains(TINT_COLOR_CONTROL_ACTIVATED, i))
        {
            j = android.support.v7.appcompat.R.attr.colorControlActivated;
            flag = true;
            obj = mode;
        } else
        if (arrayContains(TINT_COLOR_BACKGROUND_MULTIPLY, i))
        {
            j = 0x1010031;
            flag = true;
            obj = android.graphics.PorterDuff.Mode.MULTIPLY;
        } else
        {
            obj = mode;
            if (i == android.support.v7.appcompat.R.drawable.abc_list_divider_mtrl_alpha)
            {
                j = 0x1010030;
                flag = true;
                k = Math.round(40.8F);
                obj = mode;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        DEFAULT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
        TINT_COLOR_CONTROL_NORMAL = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_ic_ab_back_mtrl_am_alpha, android.support.v7.appcompat.R.drawable.abc_ic_go_search_api_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_search_api_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_commit_search_api_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_clear_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_share_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_cut_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_selectall_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_paste_mtrl_am_alpha, 
            android.support.v7.appcompat.R.drawable.abc_ic_menu_moreoverflow_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_voice_search_api_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_textfield_search_default_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_textfield_default_mtrl_alpha
        });
        TINT_COLOR_CONTROL_ACTIVATED = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_textfield_activated_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_textfield_search_activated_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha
        });
        TINT_COLOR_BACKGROUND_MULTIPLY = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_popup_background_mtrl_mult, android.support.v7.appcompat.R.drawable.abc_cab_background_internal_bg, android.support.v7.appcompat.R.drawable.abc_menu_hardkey_panel_mtrl_mult
        });
        TINT_COLOR_CONTROL_STATE_LIST = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_edit_text_material, android.support.v7.appcompat.R.drawable.abc_tab_indicator_material, android.support.v7.appcompat.R.drawable.abc_textfield_search_material, android.support.v7.appcompat.R.drawable.abc_spinner_mtrl_am_alpha, android.support.v7.appcompat.R.drawable.abc_btn_check_material, android.support.v7.appcompat.R.drawable.abc_btn_radio_material
        });
        CONTAINERS_WITH_TINT_CHILDREN = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_cab_background_top_material
        });
    }
}
