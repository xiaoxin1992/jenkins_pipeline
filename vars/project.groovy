String jobByProjectName(String jobName) {
    return jobName.trim().split("-")[0]
}

String jobByZone(String jobName) {
    return jobName.trim().split("-")[1]
}
