def call(String RepoUrl, String GitBranch) {
      git url: "${RepoUrl}", branch: "${GitBranch}"
    }
