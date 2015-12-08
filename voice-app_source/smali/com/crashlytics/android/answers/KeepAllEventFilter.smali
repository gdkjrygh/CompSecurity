.class Lcom/crashlytics/android/answers/KeepAllEventFilter;
.super Ljava/lang/Object;
.source "KeepAllEventFilter.java"

# interfaces
.implements Lcom/crashlytics/android/answers/EventFilter;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public skipEvent(Lcom/crashlytics/android/answers/SessionEvent;)Z
    .locals 1
    .param p1, "sessionEvent"    # Lcom/crashlytics/android/answers/SessionEvent;

    .prologue
    .line 9
    const/4 v0, 0x0

    return v0
.end method
