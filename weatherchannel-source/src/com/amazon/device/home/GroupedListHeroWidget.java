// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.home;

import android.content.Context;
import android.net.Uri;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.amazon.device.home:
//            HeroWidget, HeroWidgetIntent

public class GroupedListHeroWidget extends HeroWidget
{
    public static class EmptyListProperty
    {

        public HeroWidgetIntent getContentIntent()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public CharSequence getLabel()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public void setContentIntent(HeroWidgetIntent herowidgetintent)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public void setLabel(CharSequence charsequence)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public EmptyListProperty()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }
    }

    public static class Group
    {

        public CharSequence getGroupName()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public List getListEntries()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public void setGroupName(CharSequence charsequence)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public void setListEntries(List list)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public Group()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }
    }

    public class IllegalIncrementalChangeException extends Exception
    {

        final GroupedListHeroWidget this$0;

        public IllegalIncrementalChangeException(String s)
        {
            this$0 = GroupedListHeroWidget.this;
            super();
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }
    }

    public static class ListEntry
    {

        public static final float MAX_STAR_RATING = 5F;
        public static final float MIN_STAR_RATING = 0F;

        public HeroWidgetIntent getContentIntent()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public Boolean getHighlight()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public Uri getPrimaryIcon()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public CharSequence getPrimaryText()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public boolean getQuaternaryContentCanPeek()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public Uri getQuaternaryIcon()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public CharSequence getQuaternaryText()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public Integer getReviewCount()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public Uri getSecondaryIcon()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public CharSequence getSecondaryText()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public Float getStarRating()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public boolean getTertiaryContentCanPeek()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public Uri getTertiaryIcon()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public CharSequence getTertiaryText()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public VisualStyle getVisualStyle()
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry setContentIntent(HeroWidgetIntent herowidgetintent)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry setHighlight(boolean flag)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry setPrimaryIcon(Uri uri)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry setPrimaryText(CharSequence charsequence)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry setQuaternaryContentCanPeek(boolean flag)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry setQuaternaryIcon(Uri uri)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry setQuaternaryText(CharSequence charsequence)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry setReviewCount(Integer integer)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry setSecondaryIcon(Uri uri)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry setSecondaryText(CharSequence charsequence)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry setStarRating(Float float1)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry setTertiaryContentCanPeek(boolean flag)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry setTertiaryIcon(Uri uri)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry setTertiaryText(CharSequence charsequence)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry setVisualStyle(VisualStyle visualstyle)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }

        public ListEntry(Context context)
        {
            throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
        }
    }

    public static final class VisualStyle extends Enum
    {

        private static final VisualStyle $VALUES[];
        public static final VisualStyle DEFAULT;
        public static final VisualStyle PEEKABLE;
        public static final VisualStyle SHOPPING;
        public static final VisualStyle SIMPLE;

        public static VisualStyle valueOf(String s)
        {
            return (VisualStyle)Enum.valueOf(com/amazon/device/home/GroupedListHeroWidget$VisualStyle, s);
        }

        public static VisualStyle[] values()
        {
            return (VisualStyle[])$VALUES.clone();
        }

        static 
        {
            DEFAULT = new VisualStyle("DEFAULT", 0);
            PEEKABLE = new VisualStyle("PEEKABLE", 1);
            SHOPPING = new VisualStyle("SHOPPING", 2);
            SIMPLE = new VisualStyle("SIMPLE", 3);
            $VALUES = (new VisualStyle[] {
                DEFAULT, PEEKABLE, SHOPPING, SIMPLE
            });
        }

        private VisualStyle(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int MAX_LIST_SIZE = 50;
    public static final int MAX_STRING_LENGTH = 256;

    public GroupedListHeroWidget()
    {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public void addGroup(int i, Group group)
        throws IllegalIncrementalChangeException
    {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public void addListEntry(int i, int j, ListEntry listentry)
        throws IllegalIncrementalChangeException
    {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public EmptyListProperty getEmptyListProperty()
    {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public List getGroups()
    {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public void removeGroup(int i)
        throws IllegalIncrementalChangeException
    {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public void removeListEntry(int i, int j)
        throws IllegalIncrementalChangeException
    {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public void setEmptyListProperty(EmptyListProperty emptylistproperty)
    {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public void setGroups(List list)
    {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public void setSearchAttributes(Map map, CharSequence charsequence)
    {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public void setSearchAttributes(Map map, CharSequence charsequence, HeroWidgetIntent herowidgetintent)
    {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public void updateListEntry(int i, int j, ListEntry listentry)
        throws IllegalIncrementalChangeException
    {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }
}
