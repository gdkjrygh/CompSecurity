.class Lcom/urbanairship/preference/UAPreferenceAdapter$2;
.super Ljava/lang/Object;
.source "UAPreferenceAdapter.java"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/preference/UAPreferenceAdapter;->trackPreference(Lcom/urbanairship/preference/UAPreference;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/preference/UAPreferenceAdapter;

.field final synthetic val$preferenceType:Lcom/urbanairship/preference/UAPreference$PreferenceType;


# direct methods
.method constructor <init>(Lcom/urbanairship/preference/UAPreferenceAdapter;Lcom/urbanairship/preference/UAPreference$PreferenceType;)V
    .locals 0

    .prologue
    .line 282
    iput-object p1, p0, Lcom/urbanairship/preference/UAPreferenceAdapter$2;->this$0:Lcom/urbanairship/preference/UAPreferenceAdapter;

    iput-object p2, p0, Lcom/urbanairship/preference/UAPreferenceAdapter$2;->val$preferenceType:Lcom/urbanairship/preference/UAPreference$PreferenceType;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 2
    .param p1, "preference"    # Landroid/preference/Preference;
    .param p2, "newValue"    # Ljava/lang/Object;

    .prologue
    .line 285
    iget-object v0, p0, Lcom/urbanairship/preference/UAPreferenceAdapter$2;->this$0:Lcom/urbanairship/preference/UAPreferenceAdapter;

    # getter for: Lcom/urbanairship/preference/UAPreferenceAdapter;->preferences:Ljava/util/Map;
    invoke-static {v0}, Lcom/urbanairship/preference/UAPreferenceAdapter;->access$100(Lcom/urbanairship/preference/UAPreferenceAdapter;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/urbanairship/preference/UAPreferenceAdapter$2;->val$preferenceType:Lcom/urbanairship/preference/UAPreference$PreferenceType;

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    const/4 v0, 0x1

    return v0
.end method
