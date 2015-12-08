// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;


// Referenced classes of package org.codehaus.jackson.map:
//            SerializationConfig

public static final class _defaultState extends Enum
    implements _defaultState
{

    private static final WRITE_EMPTY_JSON_ARRAYS $VALUES[];
    public static final WRITE_EMPTY_JSON_ARRAYS AUTO_DETECT_FIELDS;
    public static final WRITE_EMPTY_JSON_ARRAYS AUTO_DETECT_GETTERS;
    public static final WRITE_EMPTY_JSON_ARRAYS AUTO_DETECT_IS_GETTERS;
    public static final WRITE_EMPTY_JSON_ARRAYS CAN_OVERRIDE_ACCESS_MODIFIERS;
    public static final WRITE_EMPTY_JSON_ARRAYS CLOSE_CLOSEABLE;
    public static final WRITE_EMPTY_JSON_ARRAYS DEFAULT_VIEW_INCLUSION;
    public static final WRITE_EMPTY_JSON_ARRAYS FAIL_ON_EMPTY_BEANS;
    public static final WRITE_EMPTY_JSON_ARRAYS FLUSH_AFTER_WRITE_VALUE;
    public static final WRITE_EMPTY_JSON_ARRAYS INDENT_OUTPUT;
    public static final WRITE_EMPTY_JSON_ARRAYS REQUIRE_SETTERS_FOR_GETTERS;
    public static final WRITE_EMPTY_JSON_ARRAYS SORT_PROPERTIES_ALPHABETICALLY;
    public static final WRITE_EMPTY_JSON_ARRAYS USE_ANNOTATIONS;
    public static final WRITE_EMPTY_JSON_ARRAYS USE_STATIC_TYPING;
    public static final WRITE_EMPTY_JSON_ARRAYS WRAP_EXCEPTIONS;
    public static final WRITE_EMPTY_JSON_ARRAYS WRAP_ROOT_VALUE;
    public static final WRITE_EMPTY_JSON_ARRAYS WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS;
    public static final WRITE_EMPTY_JSON_ARRAYS WRITE_DATES_AS_TIMESTAMPS;
    public static final WRITE_EMPTY_JSON_ARRAYS WRITE_DATE_KEYS_AS_TIMESTAMPS;
    public static final WRITE_EMPTY_JSON_ARRAYS WRITE_EMPTY_JSON_ARRAYS;
    public static final WRITE_EMPTY_JSON_ARRAYS WRITE_ENUMS_USING_INDEX;
    public static final WRITE_EMPTY_JSON_ARRAYS WRITE_ENUMS_USING_TO_STRING;
    public static final WRITE_EMPTY_JSON_ARRAYS WRITE_NULL_MAP_VALUES;
    public static final WRITE_EMPTY_JSON_ARRAYS WRITE_NULL_PROPERTIES;
    final boolean _defaultState;

    public static _defaultState valueOf(String s)
    {
        return (_defaultState)Enum.valueOf(org/codehaus/jackson/map/SerializationConfig$Feature, s);
    }

    public static _defaultState[] values()
    {
        return (_defaultState[])$VALUES.clone();
    }

    public boolean enabledByDefault()
    {
        return _defaultState;
    }

    public int getMask()
    {
        return 1 << ordinal();
    }

    static 
    {
        USE_ANNOTATIONS = new <init>("USE_ANNOTATIONS", 0, true);
        AUTO_DETECT_GETTERS = new <init>("AUTO_DETECT_GETTERS", 1, true);
        AUTO_DETECT_IS_GETTERS = new <init>("AUTO_DETECT_IS_GETTERS", 2, true);
        AUTO_DETECT_FIELDS = new <init>("AUTO_DETECT_FIELDS", 3, true);
        CAN_OVERRIDE_ACCESS_MODIFIERS = new <init>("CAN_OVERRIDE_ACCESS_MODIFIERS", 4, true);
        REQUIRE_SETTERS_FOR_GETTERS = new <init>("REQUIRE_SETTERS_FOR_GETTERS", 5, false);
        WRITE_NULL_PROPERTIES = new <init>("WRITE_NULL_PROPERTIES", 6, true);
        USE_STATIC_TYPING = new <init>("USE_STATIC_TYPING", 7, false);
        DEFAULT_VIEW_INCLUSION = new <init>("DEFAULT_VIEW_INCLUSION", 8, true);
        WRAP_ROOT_VALUE = new <init>("WRAP_ROOT_VALUE", 9, false);
        INDENT_OUTPUT = new <init>("INDENT_OUTPUT", 10, false);
        SORT_PROPERTIES_ALPHABETICALLY = new <init>("SORT_PROPERTIES_ALPHABETICALLY", 11, false);
        FAIL_ON_EMPTY_BEANS = new <init>("FAIL_ON_EMPTY_BEANS", 12, true);
        WRAP_EXCEPTIONS = new <init>("WRAP_EXCEPTIONS", 13, true);
        CLOSE_CLOSEABLE = new <init>("CLOSE_CLOSEABLE", 14, false);
        FLUSH_AFTER_WRITE_VALUE = new <init>("FLUSH_AFTER_WRITE_VALUE", 15, true);
        WRITE_DATES_AS_TIMESTAMPS = new <init>("WRITE_DATES_AS_TIMESTAMPS", 16, true);
        WRITE_DATE_KEYS_AS_TIMESTAMPS = new <init>("WRITE_DATE_KEYS_AS_TIMESTAMPS", 17, false);
        WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS = new <init>("WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS", 18, false);
        WRITE_ENUMS_USING_TO_STRING = new <init>("WRITE_ENUMS_USING_TO_STRING", 19, false);
        WRITE_ENUMS_USING_INDEX = new <init>("WRITE_ENUMS_USING_INDEX", 20, false);
        WRITE_NULL_MAP_VALUES = new <init>("WRITE_NULL_MAP_VALUES", 21, true);
        WRITE_EMPTY_JSON_ARRAYS = new <init>("WRITE_EMPTY_JSON_ARRAYS", 22, true);
        $VALUES = (new .VALUES[] {
            USE_ANNOTATIONS, AUTO_DETECT_GETTERS, AUTO_DETECT_IS_GETTERS, AUTO_DETECT_FIELDS, CAN_OVERRIDE_ACCESS_MODIFIERS, REQUIRE_SETTERS_FOR_GETTERS, WRITE_NULL_PROPERTIES, USE_STATIC_TYPING, DEFAULT_VIEW_INCLUSION, WRAP_ROOT_VALUE, 
            INDENT_OUTPUT, SORT_PROPERTIES_ALPHABETICALLY, FAIL_ON_EMPTY_BEANS, WRAP_EXCEPTIONS, CLOSE_CLOSEABLE, FLUSH_AFTER_WRITE_VALUE, WRITE_DATES_AS_TIMESTAMPS, WRITE_DATE_KEYS_AS_TIMESTAMPS, WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS, WRITE_ENUMS_USING_TO_STRING, 
            WRITE_ENUMS_USING_INDEX, WRITE_NULL_MAP_VALUES, WRITE_EMPTY_JSON_ARRAYS
        });
    }

    private (String s, int i, boolean flag)
    {
        super(s, i);
        _defaultState = flag;
    }
}
