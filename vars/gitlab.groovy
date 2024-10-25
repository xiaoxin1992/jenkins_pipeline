def clone(String git_url, String branch, String jenkins_gitlab_credentials_id) {
    if (git_url.trim().length() == 0) {
        error "代码仓库地址不能为空"
    }
    git branch: "${branch}", credentialsId: "${jenkins_gitlab_credentials_id}", url: "${git_url}"
}


String gitAddressJoin(String git_url, String git_group, String project) {
    if (git_group.trim().length() == 0) {
        return "${git_url}/${project}"
    }
    return "${git_url}/${git_group}/${project}"
}

String BranchName(String branch) {
    return branch.trim().split("/")[-1]
}