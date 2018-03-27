package io.kotlintest

/**
 * The description gives the full path to a [TestScope].
 * It contains the name of every parent, with the root at index 0.
 * And it includes the name of the test scope it represents.
 *
 * This is useful when you want to use a [TestCaseExtension] for tests
 * which have different tree locations but the same final name.
 */
data class Description(val parents: List<String>, val name: String) {
  fun append(name: String) =
      Description(this.parents + listOf(this.name), name)
}