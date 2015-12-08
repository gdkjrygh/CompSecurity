.class public Lcom/urbanairship/preference/QuietTimeEndPreference;
.super Lcom/urbanairship/preference/QuietTimePickerPreference;
.source "QuietTimeEndPreference.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 38
    invoke-direct {p0, p1, p2}, Lcom/urbanairship/preference/QuietTimePickerPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    return-void
.end method


# virtual methods
.method public getPreferenceType()Lcom/urbanairship/preference/UAPreference$PreferenceType;
    .locals 1

    .prologue
    .line 43
    sget-object v0, Lcom/urbanairship/preference/UAPreference$PreferenceType;->QUIET_TIME_END:Lcom/urbanairship/preference/UAPreference$PreferenceType;

    return-object v0
.end method

.method public bridge synthetic getSummary()Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    invoke-super {p0}, Lcom/urbanairship/preference/QuietTimePickerPreference;->getSummary()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1
    .param p1, "x0"    # Landroid/view/ViewGroup;

    .prologue
    .line 35
    invoke-super {p0, p1}, Lcom/urbanairship/preference/QuietTimePickerPreference;->onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic onDialogClosed(Z)V
    .locals 0
    .param p1, "x0"    # Z

    .prologue
    .line 35
    invoke-super {p0, p1}, Lcom/urbanairship/preference/QuietTimePickerPreference;->onDialogClosed(Z)V

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 35
    invoke-super {p0, p1}, Lcom/urbanairship/preference/QuietTimePickerPreference;->setValue(Ljava/lang/Object;)V

    return-void
.end method
