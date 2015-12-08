.class public Lcom/urbanairship/preference/UserIdPreference;
.super Landroid/preference/Preference;
.source "UserIdPreference.java"

# interfaces
.implements Lcom/urbanairship/preference/UAPreference;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 16
    invoke-direct {p0, p1, p2}, Landroid/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    return-void
.end method


# virtual methods
.method public getPreferenceType()Lcom/urbanairship/preference/UAPreference$PreferenceType;
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lcom/urbanairship/preference/UAPreference$PreferenceType;->USER_ID:Lcom/urbanairship/preference/UAPreference$PreferenceType;

    return-object v0
.end method

.method public onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .param p1, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 21
    invoke-super {p0, p1}, Landroid/preference/Preference;->onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 22
    .local v0, "view":Landroid/view/View;
    invoke-virtual {p0}, Lcom/urbanairship/preference/UserIdPreference;->getPreferenceType()Lcom/urbanairship/preference/UAPreference$PreferenceType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/preference/UAPreference$PreferenceType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 23
    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 0
    .param p1, "value"    # Ljava/lang/Object;

    .prologue
    .line 33
    check-cast p1, Ljava/lang/String;

    .end local p1    # "value":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/urbanairship/preference/UserIdPreference;->setSummary(Ljava/lang/CharSequence;)V

    .line 34
    return-void
.end method
