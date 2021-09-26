#!/usr/bin/sh

mkdir all_lessons
cd all_lessons

# shellcheck disable=SC2039
declare -a git_branches

# shellcheck disable=SC2039
git_branches=(
  @arithmetic-expressions
  @formating-numbers
  @flow-controllers
  @the-maith-class
  @reading-inputs
  @constants
  @exercise
  @casting
  @strings
  @arrays
  @types
)


# shellcheck disable=SC2039
for i in "${git_branches[@]}"; do
  echo "==> CREATING" ${i}...
  mkdir ${i}
  # shellcheck disable=SC2164
  cd ${i}
  echo "==> CLONING" "|" ${i} "|" BRANCH
  git clone -b ${i} --single-branch git@github.com:salihcodev/learn-java.git

  # shellcheck disable=SC2164
  echo "==> PROCESSING FILES IN" ${I}...
  cd learn-java
  mv src *.md *.iml ../
  cd ../

  echo "==> GET RID OF /learn-java DIRECTORY"
  rm -rf learn-java
  echo "DONE"

  echo "-------------------------------------------------------"
  echo

  cd ../
done

echo
echo "Successfully cloned all branches to " `pwd`/all_lessons
