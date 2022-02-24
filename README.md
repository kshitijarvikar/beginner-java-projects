# beginner-java-projects
## Add Your Beginner friendly JAVA files to our repository.
## How to clone the repository and make changes locally

- Click on the green `Code` button, then either the HTTPS or SSH option and, click the icon to copy the URL. Now you have a copy of the project. Thus, you can play around with it locally on your computer.

- Run the following commands into a terminal window (Command Prompt, Powershell, Terminal, Bash, ZSH). Do this to download the forked copy of this repository to your computer.

```bash
  git clone https://github.com/YOUR_GITHUB_USERNAMe/beginner-java-projects.git
```

- Switch to the cloned folder. You can paste this command into the same terminal window.

```bash
  cd beginner-java-projects
```

- Make a new branch. Your username would make a good branch because it's unique.

```bash
  git checkout -b <name-of-new-branch>
```

- Addd your files to the folder

- Stage your Chamges

```bash
  git add .
```

- Commit the changes.

```bash
  git commit -m "Add <your-github-username>"
```
- Check the status of your repository.

```bash
  git status
```

- The response should be like this:

```bash
On branch <name-of-your-branch>
nothing to commit, working tree clean
```

- Pushing your repository to GitHub.

```bash
  git push origin <name-of-your-branch>
```

or

```bash
  git branch -M main
  git push -u origin main
```

If you get an error message like the one below, you probably forgot to fork the repository before cloning it. It is best to start over and fork the project repository first.

```bash
ERROR: Permission to kshitijarvikar/beginner-java-projects.git denied to <your-github-username>.
fatal: Could not read from remote repository.
Please make sure you have the correct access rights and the repository exists.
```

- On the GitHub website, navigate to your forked repo - on the top of the files section, you'll notice a new section containing a `Compare & Pull Request` button!

- Click on that button, this will load a new page, comparing the local branch in your forked repository against the main branch in the EddieHub Hacktoberfest repository. Accept the default values in the dropdown boxes and click the green `Create Pull Request` button. After creating the PR (Pull Request), our GitHub Actions workflow will add a welcome message to your PR.
  Note: A pull request allows us to merge your changes with the original project repo.

- Your pull request will be reviewed and then eventually merged.

Hurray! You successfully have made your first contribution! 🎉

---

