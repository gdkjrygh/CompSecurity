.class Lcom/urbanairship/preference/UAPreferenceAdapter$1;
.super Ljava/lang/Object;
.source "UAPreferenceAdapter.java"

# interfaces
.implements Ljava/lang/Runnable;


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

.field final synthetic val$preference:Lcom/urbanairship/preference/UAPreference;


# direct methods
.method constructor <init>(Lcom/urbanairship/preference/UAPreferenceAdapter;Lcom/urbanairship/preference/UAPreference;)V
    .locals 0

    .prologue
    .line 270
    iput-object p1, p0, Lcom/urbanairship/preference/UAPreferenceAdapter$1;->this$0:Lcom/urbanairship/preference/UAPreferenceAdapter;

    iput-object p2, p0, Lcom/urbanairship/preference/UAPreferenceAdapter$1;->val$preference:Lcom/urbanairship/preference/UAPreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 273
    iget-object v0, p0, Lcom/urbanairship/preference/UAPreferenceAdapter$1;->this$0:Lcom/urbanairship/preference/UAPreferenceAdapter;

    iget-object v1, p0, Lcom/urbanairship/preference/UAPreferenceAdapter$1;->val$preference:Lcom/urbanairship/preference/UAPreference;

    # invokes: Lcom/urbanairship/preference/UAPreferenceAdapter;->trackPreference(Lcom/urbanairship/preference/UAPreference;)V
    invoke-static {v0, v1}, Lcom/urbanairship/preference/UAPreferenceAdapter;->access$000(Lcom/urbanairship/preference/UAPreferenceAdapter;Lcom/urbanairship/preference/UAPreference;)V

    .line 274
    return-void
.end method
