.class abstract Lcom/urbanairship/preference/QuietTimePickerPreference;
.super Landroid/preference/DialogPreference;
.source "QuietTimePickerPreference.java"

# interfaces
.implements Lcom/urbanairship/preference/UAPreference;


# instance fields
.field private currentTime:J

.field private timePicker:Landroid/widget/TimePicker;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 52
    invoke-direct {p0, p1, p2}, Landroid/preference/DialogPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/urbanairship/preference/QuietTimePickerPreference;->timePicker:Landroid/widget/TimePicker;

    .line 44
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/urbanairship/preference/QuietTimePickerPreference;->currentTime:J

    .line 53
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 48
    invoke-direct {p0, p1, p2, p3}, Landroid/preference/DialogPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/urbanairship/preference/QuietTimePickerPreference;->timePicker:Landroid/widget/TimePicker;

    .line 44
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/urbanairship/preference/QuietTimePickerPreference;->currentTime:J

    .line 49
    return-void
.end method

.method private getCalendar()Ljava/util/Calendar;
    .locals 6

    .prologue
    .line 100
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 102
    .local v0, "calendar":Ljava/util/Calendar;
    iget-wide v2, p0, Lcom/urbanairship/preference/QuietTimePickerPreference;->currentTime:J

    const-wide/16 v4, -0x1

    cmp-long v1, v2, v4

    if-eqz v1, :cond_0

    .line 103
    iget-wide v2, p0, Lcom/urbanairship/preference/QuietTimePickerPreference;->currentTime:J

    invoke-virtual {v0, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 106
    :cond_0
    return-object v0
.end method


# virtual methods
.method public bridge synthetic getSummary()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 42
    invoke-virtual {p0}, Lcom/urbanairship/preference/QuietTimePickerPreference;->getSummary()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSummary()Ljava/lang/String;
    .locals 2

    .prologue
    .line 92
    invoke-virtual {p0}, Lcom/urbanairship/preference/QuietTimePickerPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v0

    invoke-direct {p0}, Lcom/urbanairship/preference/QuietTimePickerPreference;->getCalendar()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected onCreateDialogView()Landroid/view/View;
    .locals 3

    .prologue
    .line 64
    new-instance v1, Landroid/widget/TimePicker;

    invoke-virtual {p0}, Lcom/urbanairship/preference/QuietTimePickerPreference;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/TimePicker;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/urbanairship/preference/QuietTimePickerPreference;->timePicker:Landroid/widget/TimePicker;

    .line 66
    iget-object v1, p0, Lcom/urbanairship/preference/QuietTimePickerPreference;->timePicker:Landroid/widget/TimePicker;

    invoke-virtual {p0}, Lcom/urbanairship/preference/QuietTimePickerPreference;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TimePicker;->setIs24HourView(Ljava/lang/Boolean;)V

    .line 68
    invoke-direct {p0}, Lcom/urbanairship/preference/QuietTimePickerPreference;->getCalendar()Ljava/util/Calendar;

    move-result-object v0

    .line 69
    .local v0, "calendar":Ljava/util/Calendar;
    iget-object v1, p0, Lcom/urbanairship/preference/QuietTimePickerPreference;->timePicker:Landroid/widget/TimePicker;

    const/16 v2, 0xb

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TimePicker;->setCurrentHour(Ljava/lang/Integer;)V

    .line 70
    iget-object v1, p0, Lcom/urbanairship/preference/QuietTimePickerPreference;->timePicker:Landroid/widget/TimePicker;

    const/16 v2, 0xc

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TimePicker;->setCurrentMinute(Ljava/lang/Integer;)V

    .line 72
    iget-object v1, p0, Lcom/urbanairship/preference/QuietTimePickerPreference;->timePicker:Landroid/widget/TimePicker;

    return-object v1
.end method

.method public onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .param p1, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 57
    invoke-super {p0, p1}, Landroid/preference/DialogPreference;->onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 58
    .local v0, "view":Landroid/view/View;
    invoke-virtual {p0}, Lcom/urbanairship/preference/QuietTimePickerPreference;->getPreferenceType()Lcom/urbanairship/preference/UAPreference$PreferenceType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/preference/UAPreference$PreferenceType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 59
    return-object v0
.end method

.method public onDialogClosed(Z)V
    .locals 5
    .param p1, "positiveResult"    # Z

    .prologue
    .line 77
    if-eqz p1, :cond_0

    .line 78
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 79
    .local v0, "calendar":Ljava/util/Calendar;
    const/16 v1, 0xb

    iget-object v4, p0, Lcom/urbanairship/preference/QuietTimePickerPreference;->timePicker:Landroid/widget/TimePicker;

    invoke-virtual {v4}, Landroid/widget/TimePicker;->getCurrentHour()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v0, v1, v4}, Ljava/util/Calendar;->set(II)V

    .line 80
    const/16 v1, 0xc

    iget-object v4, p0, Lcom/urbanairship/preference/QuietTimePickerPreference;->timePicker:Landroid/widget/TimePicker;

    invoke-virtual {v4}, Landroid/widget/TimePicker;->getCurrentMinute()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v0, v1, v4}, Ljava/util/Calendar;->set(II)V

    .line 82
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    .line 83
    .local v2, "time":J
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/urbanairship/preference/QuietTimePickerPreference;->callChangeListener(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 84
    iput-wide v2, p0, Lcom/urbanairship/preference/QuietTimePickerPreference;->currentTime:J

    .line 85
    invoke-virtual {p0}, Lcom/urbanairship/preference/QuietTimePickerPreference;->notifyChanged()V

    .line 88
    .end local v0    # "calendar":Ljava/util/Calendar;
    .end local v2    # "time":J
    :cond_0
    return-void
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 2
    .param p1, "value"    # Ljava/lang/Object;

    .prologue
    .line 111
    check-cast p1, Ljava/lang/Long;

    .end local p1    # "value":Ljava/lang/Object;
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/urbanairship/preference/QuietTimePickerPreference;->currentTime:J

    .line 112
    invoke-virtual {p0}, Lcom/urbanairship/preference/QuietTimePickerPreference;->notifyChanged()V

    .line 113
    return-void
.end method

.method protected shouldPersist()Z
    .locals 1

    .prologue
    .line 118
    const/4 v0, 0x0

    return v0
.end method
