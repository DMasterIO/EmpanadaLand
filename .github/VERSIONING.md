# 🔖 Semantic Versioning Configuration for EmpanadaLand

# This file defines the semantic versioning strategy for the EmpanadaLand mod
# Following the format: MAJOR.MINOR.PATCH
# 
# MAJOR: Incompatible API changes or major Minecraft version updates
# MINOR: New features in a backward compatible manner
# PATCH: Bug fixes and small improvements

## Version Bump Rules

### MAJOR version bumps (X.0.0):
- Minecraft version updates (e.g., 1.21.6 → 1.22.0)
- Breaking changes to mod API
- Complete rewrite or major architectural changes
- NeoForge major version updates

### MINOR version bumps (1.X.0):
- New food items or recipes
- New game mechanics or features
- New configuration options
- New integrations with other mods
- NeoForge minor version updates

### PATCH version bumps (1.0.X):
- Bug fixes
- Performance improvements
- Balance tweaks (effect duration, recipe costs)
- Translation updates
- Code cleanup and refactoring
- Documentation updates

## Commit Message Conventions

Use conventional commits to trigger automatic version bumps:

### For PATCH bumps:
- `fix: correct empanada effect duration`
- `perf: optimize tooltip rendering`
- `docs: update installation instructions`

### For MINOR bumps:
- `feat: add sopaipilla item with regeneration effect`
- `feat: implement mod configuration system`
- `feat: add JEI integration`

### For MAJOR bumps:
- `feat!: migrate to Minecraft 1.22`
- `refactor!: complete API rewrite`
- `feat!: breaking change to recipe system`

## Release Branch Strategy

- **master**: Production-ready code, triggers releases
- **develop**: Integration branch for new features
- **feature/***: Individual feature branches
- **hotfix/***: Critical bug fixes

## Automated Workflows

1. **build.yml**: Builds and releases on master push
2. **pr-validation.yml**: Validates pull requests
3. **manual-release.yml**: Manual release creation

## File Synchronization

Version is maintained in:
- `gradle.properties` → `mod_version=X.Y.Z`
- `build.gradle` → `version = 'X.Y.Z'`
- Git tags → `vX.Y.Z`

## Pre-release Versions

For development versions, use suffixes:
- `1.2.3-alpha.1` - Early development
- `1.2.3-beta.1` - Feature complete, testing
- `1.2.3-rc.1` - Release candidate

## Compatibility Matrix

| EmpanadaLand Version | Minecraft Version | NeoForge Version |
|---------------------|-------------------|------------------|
| 1.0.x               | 1.21.6           | 21.6.0-beta      |
| 1.1.x               | 1.21.6           | 21.6.x           |
| 2.0.x               | 1.22.x           | 22.x.x           |

## Manual Release Process

1. Update version in `gradle.properties` and `build.gradle`
2. Create release notes in GitHub
3. Tag the release: `git tag -a v1.2.3 -m "Release 1.2.3"`
4. Push tag: `git push origin v1.2.3`
5. GitHub Actions will handle the rest

## Changelog Generation

Changelog is automatically generated from:
- Conventional commit messages
- Pull request titles
- Git commit history between tags

## Quality Gates

Before releasing:
- ✅ All tests pass
- ✅ Build succeeds on all platforms
- ✅ No critical security vulnerabilities
- ✅ Manual testing completed
- ✅ Documentation updated
